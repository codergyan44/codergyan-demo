// Insecure: Command injection vulnerability
const { exec } = require('child_process');

function listFiles(userInput) {
    // User input is included unsafely in the command
    exec('ls ' + userInput, (err, stdout, stderr) => {
        if (err) {
            console.error('Error:', err);
            return;
        }
        console.log('Files:', stdout);
    });
}

listFiles(process.argv[2]);
