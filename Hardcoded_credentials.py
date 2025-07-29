# Insecure: Hardcoded credentials in source code
def connect_to_db():
    username = "admin"
    password = "SuperSecret123"
    host = "localhost"
    port = 5432
    # Imagine this connects to a database using hardcoded credentials
    print(f"Connecting to DB as {username} with password {password}")

connect_to_db()
