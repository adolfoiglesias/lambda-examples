/**
 * 
 */
package com.calarix.lambda.example.exceptions;

import java.io.File;
import java.io.IOException;

/**
 * @author amich
 *
 */
@FunctionalInterface
public interface ReadFile {
	
	File read(String path) throws IOException;

}
