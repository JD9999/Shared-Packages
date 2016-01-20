package Timers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Uses a filetimer like seasons, but not directly copied from it, rather modified for customisation.
 *
 */
public class filetimer {

public filetimer(){
	
}	
	
	public static boolean keeprunning = true;
		/**
		 * This method starts a timer by reading (file) file and checks it's contents. Like Seasons
		 * @param file The file to scan.
		 */
		public void starttimer(File file){
			int timeinterval;
			System.out.println("Starting timer!");
			BufferedReader reader = null;
			String timera;
			try{
				reader = new BufferedReader(new FileReader(file));
				while((timera = reader.readLine())!=null){
					if(timera.endsWith("d")){
						if(timera.equalsIgnoreCase("1d")){
							 timeinterval = 1*24*60*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
									  switchseason(file);
									  }else{
										  timer.cancel();
									  }
								  }						
								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("2d")){
							 timeinterval = 2*24*60*60*1000;
					    	Timer timer = new Timer();
							timer.scheduleAtFixedRate(new TimerTask() {
							  @Override
							  public void run() {
								  if(keeprunning){
									  switchseason(file);
									  }else{
										  timer.cancel();
									  }
							  }		
							} , timeinterval, timeinterval);
							return;
					}else if(timera.equalsIgnoreCase("3d")){
						 timeinterval = 3*24*60*60*1000;
					    	Timer timer = new Timer();
							timer.scheduleAtFixedRate(new TimerTask() {
							  @Override
							  public void run() {
								  if(keeprunning){
									  switchseason(file);
									  }else{
										  timer.cancel();
									  }
							  }				
							} , timeinterval, timeinterval);
							return;
					}else if(timera.equalsIgnoreCase("4d")){
						 timeinterval = 4*24*60*60*1000;
					    	Timer timer = new Timer();
							timer.scheduleAtFixedRate(new TimerTask() {
							  @Override
							  public void run() {
								  if(keeprunning){
									  switchseason(file);
									  }else{
										  timer.cancel();
									  }
							  }				
							} , timeinterval, timeinterval);
							return;
					}else if(timera.equalsIgnoreCase("5d")){
						 timeinterval = 5*24*60*60*1000;
					    	Timer timer = new Timer();
							timer.scheduleAtFixedRate(new TimerTask() {
							  @Override
							  public void run() {
								  if(keeprunning){
									  switchseason(file);
									  }else{
										  timer.cancel();
									  }
							  }						
							} , timeinterval, timeinterval);
							return;
					}else if(timera.equalsIgnoreCase("6d")){
						 timeinterval = 6*24*60*60*1000;
					    	Timer timer = new Timer();
							timer.scheduleAtFixedRate(new TimerTask() {
							  @Override
							  public void run() {
								  if(keeprunning){
									  switchseason(file);
									  }else{
										  timer.cancel();
									  }
							  }					
							} , timeinterval, timeinterval);
							return;
					}else if(timera.equalsIgnoreCase("7d")){
						 timeinterval = 1*24*60*60*1000;
					    	Timer timer = new Timer();
							timer.scheduleAtFixedRate(new TimerTask() {
							  @Override
							  public void run() {
								  if(keeprunning){
									  switchseason(file);
									  }else{
										  timer.cancel();
									  }
							  }				
							} , timeinterval, timeinterval);
							return;
					}			
				}
					else if(timera.endsWith("h")){
						if(timera.equalsIgnoreCase("1h")){
							timeinterval = 1*60*60*1000;
							Timer timer = new Timer();
							timer.scheduleAtFixedRate(new TimerTask() {
							  @Override
							  public void run() {
								  if(keeprunning){
									  switchseason(file);
									  }else{
										  timer.cancel();
									  }
							  }
							} , timeinterval, timeinterval);
							return;
						}
						else if(timera.equalsIgnoreCase("2h")){
							timeinterval = 2*60*60*1000;
							Timer timer = new Timer();
							timer.scheduleAtFixedRate(new TimerTask() {
							  @Override
							  public void run() {
								  if(keeprunning){
									  switchseason(file);
									  }else{
										  timer.cancel();
									  }
							  }
							} , timeinterval, timeinterval);
							return;
						}
						if(timera.equalsIgnoreCase("3h")){
							 timeinterval = 3*60*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("4h")){
							 timeinterval = 4*60*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
					}
					else if(timera.equalsIgnoreCase("5h")){
						 timeinterval = 5*60*60*1000;
					    	Timer timer = new Timer();
							timer.scheduleAtFixedRate(new TimerTask() {
							  @Override
							  public void run() {
								  if(keeprunning){
									  switchseason(file);
									  }else{
										  timer.cancel();
									  }
							  }

							} , timeinterval, timeinterval);
							return;
					}
					else if (timera.equalsIgnoreCase("6h")){
						timeinterval = 6*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("7h")){
						timeinterval = 7*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("8h")){
						timeinterval = 8*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("9h")){
						timeinterval = 9*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("10h")){
						timeinterval = 10*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("11h")){
						timeinterval = 11*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("12h")){
						timeinterval = 12*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("13h")){
						timeinterval = 13*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("14h")){
						timeinterval = 14*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("15h")){
						timeinterval = 15*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("16h")){
						timeinterval = 16*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("17h")){
						timeinterval = 17*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("18h")){
						timeinterval = 18*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("19h")){
						timeinterval = 19*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("20h")){
						timeinterval = 20*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("21h")){
						timeinterval = 21*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}else if (timera.equalsIgnoreCase("22h")){
						timeinterval = 22*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if (timera.equalsIgnoreCase("23h")){
						timeinterval = 23*60*60*1000;
				    	Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }

						} , timeinterval, timeinterval);
						return;
					}
					else if(timera.endsWith("m")){			
						if(timera.equalsIgnoreCase("1m")){
							 timeinterval = 1*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("2m")){
							 timeinterval = 2*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("3m")){
							 timeinterval = 3*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("4m")){
							 timeinterval = 4*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("5m")){
							 timeinterval = 5*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("6m")){
							 timeinterval = 6*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("7m")){
							 timeinterval = 7*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("8m")){
							 timeinterval = 8*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("9m")){
							 timeinterval = 9*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("10m")){
							 timeinterval = 10*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("11m")){
							 timeinterval = 11*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("12m")){
							 timeinterval = 12*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("13m")){
							 timeinterval = 13*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("14m")){
							 timeinterval = 14*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("15m")){
							 timeinterval = 15*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("16m")){
							 timeinterval = 16*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("17m")){
							 timeinterval = 17*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("18m")){
							 timeinterval = 18*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("19m")){
							 timeinterval = 19*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("20m")){
							 timeinterval = 20*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("21m")){
							 timeinterval = 21*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("22m")){
							 timeinterval = 22*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("23m")){
							 timeinterval = 23*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("24m")){
							 timeinterval = 24*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("25m")){
							 timeinterval = 25*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("26m")){
							 timeinterval = 26*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("27m")){
							 timeinterval = 27*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("28m")){
							 timeinterval = 28*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("29m")){
							 timeinterval = 29*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("30m")){
							 timeinterval = 30*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("31m")){
							 timeinterval = 31*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("32m")){
							 timeinterval = 32*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("33m")){
							 timeinterval = 33*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("34m")){
							 timeinterval = 34*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("35m")){
							 timeinterval = 35*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("36m")){
							 timeinterval = 36*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("37m")){
							 timeinterval = 37*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("38m")){
							 timeinterval = 38*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("39m")){
							 timeinterval = 39*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("40m")){
							 timeinterval = 40*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("41m")){
							 timeinterval = 41*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("42m")){
							 timeinterval = 42*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("43m")){
							 timeinterval = 43*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("44m")){
							 timeinterval = 44*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("45m")){
							 timeinterval = 45*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("46m")){
							 timeinterval = 46*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("47m")){
							 timeinterval = 47*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("48m")){
							 timeinterval = 48*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("49m")){
							 timeinterval = 49*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("50m")){
							 timeinterval = 50*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("51m")){
							 timeinterval = 51*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("52m")){
							 timeinterval = 52*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("53m")){
							 timeinterval = 53*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("54m")){
							 timeinterval = 54*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("55m")){
							 timeinterval = 55*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("56m")){
							 timeinterval = 56*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("57m")){
							 timeinterval = 57*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("58m")){
							 timeinterval = 58*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("59m")){
							 timeinterval = 36*60*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
					}
					else if(timera.endsWith("s")){
						if(timera.equalsIgnoreCase("1s")){
							 timeinterval = 1*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("2s")){
							 timeinterval = 2*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("3s")){
							 timeinterval = 3*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("4s")){
							 timeinterval = 4*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("5s")){
							 timeinterval = 5*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("6s")){
							 timeinterval = 6*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("7s")){
							 timeinterval = 7*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("8s")){
							 timeinterval = 8*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("9s")){
							 timeinterval = 9*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("10s")){
							 timeinterval = 10*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("11s")){
							 timeinterval = 11*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("12s")){
							 timeinterval = 12*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("13s")){
							 timeinterval = 13*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("14s")){
							 timeinterval = 14*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("15s")){
							 timeinterval = 15*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("16s")){
							 timeinterval = 16*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("17s")){
							 timeinterval = 17*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("18s")){
							 timeinterval = 18*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("19s")){
							 timeinterval = 19*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("20s")){
							 timeinterval = 20*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("21s")){
							 timeinterval = 21*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("22s")){
							 timeinterval = 22*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("23s")){
							 timeinterval = 23*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("24s")){
							 timeinterval = 24*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("25s")){
							 timeinterval = 25*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("26s")){
							 timeinterval = 26*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("27s")){
							 timeinterval = 27*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("28s")){
							 timeinterval = 28*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("29s")){
							 timeinterval = 29*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("30s")){
							 timeinterval = 30*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("31s")){
							 timeinterval = 31*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("32s")){
							 timeinterval = 32*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("33s")){
							 timeinterval = 33*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("34s")){
							 timeinterval = 34*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("35s")){
							 timeinterval = 35*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("36s")){
							 timeinterval = 36*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("37s")){
							 timeinterval = 37*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("38s")){
							 timeinterval = 38*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("39s")){
							 timeinterval = 39*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("40s")){
							 timeinterval = 40*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("41s")){
							 timeinterval = 41*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("42s")){
							 timeinterval = 42*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("43s")){
							 timeinterval = 43*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("44s")){
							 timeinterval = 44*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("45s")){
							 timeinterval = 45*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("46s")){
							 timeinterval = 46*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("47s")){
							 timeinterval = 47*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("48s")){
							 timeinterval = 48*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("49s")){
							 timeinterval = 49*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("50s")){
							 timeinterval = 50*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("51s")){
							 timeinterval = 51*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("52s")){
							 timeinterval = 52*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("53s")){
							 timeinterval = 53*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("54s")){
							 timeinterval = 54*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("55s")){
							 timeinterval = 55*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("56s")){
							 timeinterval = 56*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("57s")){
							 timeinterval = 57*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("58s")){
							 timeinterval = 58*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
						else if(timera.equalsIgnoreCase("59s")){
							 timeinterval = 36*1000;
						    	Timer timer = new Timer();
								timer.scheduleAtFixedRate(new TimerTask() {
								  @Override
								  public void run() {
									  if(keeprunning){
										  switchseason(file);
										  }else{
											  timer.cancel();
										  }
								  }

								} , timeinterval, timeinterval);
								return;
						}
					}else{
					System.err.println("There is a problem with the timer file! Make sure what ever is in there can be read!");
					System.err.println("Putting on a two-hour timer.");
					{
						timeinterval = 2*60*60*1000;
						Timer timer = new Timer();
						timer.scheduleAtFixedRate(new TimerTask() {
						  @Override
						  public void run() {
							  if(keeprunning){
								  switchseason(file);
								  }else{
									  timer.cancel();
								  }
						  }
						} , timeinterval, timeinterval);
						return;
					}
					}	
					}
				
				}catch(IOException e){
				e.printStackTrace();
	}finally{
		try{
			reader.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
		}
		/**
		 * The only reason this method even exists is because I would have to remove it 200 times!
		 * That would be a pain.
		 * @param file the file being written to.
		 */
		public static void switchseason(File file) {
			System.out.println("File timer read!");
								}
	
}
