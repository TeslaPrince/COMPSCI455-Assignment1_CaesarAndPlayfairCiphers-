# COMPSCI455-Assignment1_CaesarAndPlayfairCiphers-
## Part 1 (10 pts)
Programming Required
Suppose you intercept the following ciphertexts.  You know that the sender is using a Caesar Cipher to encrypt the messages.  Write a program which performs a brute-force attack on the messages.  Recall that a brute-force attack tries every possible key to decrypt a message.
1. TUZBKXEYKIAXK
2. TSJLCPYZJCRMZPSRCDMPACYRRYAIQ
Your program should use all possible Caesar Cipher keys to print out each possible plaintext message.  Once you have all the possible key/plaintext pairs, include (as a a comment in your code, a hard-coded print statement, a comment on Canvas, or in an included text file) what you believe the key and plaintext are.  Do this for both message #1 and message #2.
## Part 2 (5 pts)
Programming Optional
Using a Playfair cipher, encrypt the plaintext "HELLOWORLD" using the key "PASSWORD".  Show your work by including your tableau.
## Part 3 (5 pts)
Programming Optional
Suppose you receive a message from a trusted contact with whom you exchange messages using a Playfair cipher and the key "LIGHTNING".  The message contains the text "PMDSQGHZKXFNMC".  Decrypt the message and write it as plaintext.  Show your work by including your tableau.
## Extra Credit (Bonus 2 pts towards Homework)
Write a program which performs the necessary operations for Parts 2 (Playfair encryption) and 3 (decryption).  It should print the tableau in square format and print the correct answer for each part.
## Hint (Parts 2 and 3)
When encrypting plaintext with a Playfair cipher and the letter pairs are not in the same row AND not in the same column (Case #4), the first letter of the encrypted pair is the one from the same row as the first letter of the plaintext pair.
