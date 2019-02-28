def numUniqueEmails(emails):
    """
    :type emails: List[str]
    :rtype: int
    """
    email_count = {}
    for email in emails:
        email = parseEmail(email)
        if email in email_count:
            email_count[email] += 1
        else:
            email_count[email] = 1
    return len(email_count)
            

def parseEmail(email):
    email_array = email.split('@')
    local_name = email_array[0]
    local_name = local_name.split('+')[0]
    local_name = local_name.replace('.', '')
    return local_name + email_array[1]
