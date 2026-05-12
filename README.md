<img width="1920" height="1080" alt="failed _ci_debug" src="https://github.com/user-attachments/assets/364cb551-ed20-42d0-91a5-eec4d891a8a4" /># Exclusive-report-generator
# Assignment 5 :

# CI/CD Basics

## What is CI/CD?

CI/CD stands for:

- **CI (Continuous Integration)**  
  Developers frequently push code changes to a shared repository.  
  Automated tests and checks run to verify the code works correctly.

- **CD (Continuous Delivery / Deployment)**  
  After successful testing, the application is automatically prepared or deployed to servers.

### Benefits

- Faster development cycle
- Fewer bugs in production
- Automated testing and deployment
- Better collaboration among developers

---

# Self-Hosted Runner

A **self-hosted runner** is a machine you manage yourself that executes CI/CD jobs.

Instead of using cloud-hosted runners provided by platforms like GitHub Actions or GitLab CI, you can run workflows on:

- Your own server
- VPS
- Local machine
- On-premise infrastructure

## Why Use Self-Hosted Runners?

- More control over environment
- Faster builds with custom caching
- Access to private/internal resources
- Ability to use custom hardware or software

## Example Use Cases

- Deploying apps inside private networks
- Running Docker or Kubernetes workloads
- Using GPU-enabled machines for AI workloads

---

# Workflow Execution

A **workflow** is an automated pipeline that runs a sequence of tasks.

## Typical Workflow Steps

1. Trigger workflow (push, pull request, manual trigger)
2. Checkout source code
3. Install dependencies
4. Run tests
5. Build application
6. Deploy to server

## Example Workflow Flow

```text
Developer Pushes Code
        ↓
CI Pipeline Starts
        ↓
Run Tests & Checks
        ↓
Build Application
        ↓
Deploy to Production

```

## Failed ci dubugging
<img width="1920" height="1080" alt="failed _ci_debug" src="https://github.com/user-attachments/assets/40262ab1-b202-4d26-aa93-218089ab5c01" />

## Success ci 
<img width="1920" height="1080" alt="success" src="https://github.com/user-attachments/assets/5b2d31ee-a6eb-4681-bed1-eb2bd4562bd2" />

