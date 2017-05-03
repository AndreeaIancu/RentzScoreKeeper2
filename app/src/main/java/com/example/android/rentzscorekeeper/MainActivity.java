package com.example.android.rentzscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static com.example.android.rentzscorekeeper.R.string.error_message;

public class MainActivity extends AppCompatActivity {

    /**
     * Declaration of global variables used
     */
    int scoreForPlayerOne;
    int scoreForPlayerTwo;
    int scoreForPlayerThree;
    int scoreForPlayerFour;
    int scoreForPlayerFive;
    int scoreForPlayerSix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when one of the player checkboxes is checked.
     * It ensures that a single player is selected at a time, as such
     * the 6 player checkboxes function in a way similar to a RadioGroup view, where
     * only one out of the six checkboxes can be selected.
     */
    public void selectOnlyOnePlayer(View myView) {
        if (null == myView) return;

        CheckBox myCheckBox = (CheckBox) myView;

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);


        if (myCheckBox.getId() != R.id.player_1_checkbox) {
            checkBoxPlayerOne.setChecked(false);
        }
        if (myCheckBox.getId() != R.id.player_2_checkbox) {
            checkBoxPlayerTwo.setChecked(false);
        }
        if (myCheckBox.getId() != R.id.player_3_checkbox) {
            checkBoxPlayerThree.setChecked(false);
        }
        if (myCheckBox.getId() != R.id.player_4_checkbox) {
            checkBoxPlayerFour.setChecked(false);
        }
        if (myCheckBox.getId() != R.id.player_5_checkbox) {
            checkBoxPlayerFive.setChecked(false);
        }
        if (myCheckBox.getId() != R.id.player_6_checkbox) {
            checkBoxPlayerSix.setChecked(false);
        }
    }

    /**
     * This method is called when the K button is pressed.
     * It increases / decreases the score by 100 points depending
     * on whether the positiveGame checkbox is checked.
     * The increase/ decrease to the score is doubled when
     * the blindGame checkbox is checked.
     */
    public void kingOfHearts(View view) {

        int king = -100;

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);
        CheckBox checkBoxBlind = (CheckBox) findViewById(R.id.blind_checkbox);
        CheckBox checkBoxPositive = (CheckBox) findViewById(R.id.plus_checkbox);

        boolean playerOneSelected = checkBoxPlayerOne.isChecked();
        boolean playerTwoSelected = checkBoxPlayerTwo.isChecked();
        boolean playerThreeSelected = checkBoxPlayerThree.isChecked();
        boolean playerFourSelected = checkBoxPlayerFour.isChecked();
        boolean playerFiveSelected = checkBoxPlayerFive.isChecked();
        boolean playerSixSelected = checkBoxPlayerSix.isChecked();
        boolean blindGame = checkBoxBlind.isChecked();
        boolean positiveGame = checkBoxPositive.isChecked();

        if (!playerOneSelected &&
                !playerTwoSelected &&
                !playerThreeSelected &&
                !playerFourSelected &&
                !playerFiveSelected &&
                !playerSixSelected) {

            Toast.makeText(this, error_message, Toast.LENGTH_SHORT).show();
            return;
        }

        if (playerOneSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerOne += -king * 2;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                } else {
                    scoreForPlayerOne += king * 2;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerOne += -king;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                } else {
                    scoreForPlayerOne += king;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                }

            }
        }

        if (playerTwoSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerTwo += -king * 2;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                } else {
                    scoreForPlayerTwo += king * 2;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerTwo += -king;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                } else {
                    scoreForPlayerTwo += king;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                }

            }
        }

        if (playerThreeSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerThree += -king * 2;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                } else {
                    scoreForPlayerThree += king * 2;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerThree += -king;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                } else {
                    scoreForPlayerThree += king;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                }

            }
        }


        if (playerFourSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerFour += -king * 2;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                } else {
                    scoreForPlayerFour += king * 2;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerFour += -king;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                } else {
                    scoreForPlayerFour += king;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                }

            }
        }


        if (playerFiveSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerFive += -king * 2;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                } else {
                    scoreForPlayerFive += king * 2;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerFive += -king;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                } else {
                    scoreForPlayerFive += king;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                }

            }
        }


        if (playerSixSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerSix += -king * 2;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                } else {
                    scoreForPlayerSix += king * 2;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerSix += -king;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                } else {
                    scoreForPlayerSix += king;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                }
            }
        }
    }

    /**
     * This method is called when the Q button is pressed.
     * It increases / decreases the score by 25 points depending
     * on whether the positiveGame checkbox is checked.
     * The increase/ decrease to the score is doubled when
     * the blindGame checkbox is checked.
     */
    public void queens(View view) {

        int queen = -25;

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);
        CheckBox checkBoxBlind = (CheckBox) findViewById(R.id.blind_checkbox);
        CheckBox checkBoxPositive = (CheckBox) findViewById(R.id.plus_checkbox);

        boolean playerOneSelected = checkBoxPlayerOne.isChecked();
        boolean playerTwoSelected = checkBoxPlayerTwo.isChecked();
        boolean playerThreeSelected = checkBoxPlayerThree.isChecked();
        boolean playerFourSelected = checkBoxPlayerFour.isChecked();
        boolean playerFiveSelected = checkBoxPlayerFive.isChecked();
        boolean playerSixSelected = checkBoxPlayerSix.isChecked();
        boolean blindGame = checkBoxBlind.isChecked();
        boolean positiveGame = checkBoxPositive.isChecked();

        if (!playerOneSelected &&
                !playerTwoSelected &&
                !playerThreeSelected &&
                !playerFourSelected &&
                !playerFiveSelected &&
                !playerSixSelected) {

            Toast.makeText(this, error_message, Toast.LENGTH_SHORT).show();
            return;
        }

        if (playerOneSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerOne += -queen * 2;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                } else {
                    scoreForPlayerOne += queen * 2;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerOne += -queen;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                } else {
                    scoreForPlayerOne += queen;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                }

            }
        }

        if (playerTwoSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerTwo += -queen * 2;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                } else {
                    scoreForPlayerTwo += queen * 2;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerTwo += -queen;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                } else {
                    scoreForPlayerTwo += queen;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                }

            }
        }

        if (playerThreeSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerThree += -queen * 2;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                } else {
                    scoreForPlayerThree += queen * 2;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerThree += -queen;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                } else {
                    scoreForPlayerThree += queen;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                }

            }
        }


        if (playerFourSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerFour += -queen * 2;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                } else {
                    scoreForPlayerFour += queen * 2;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerFour += -queen;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                } else {
                    scoreForPlayerFour += queen;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                }

            }
        }


        if (playerFiveSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerFive += -queen * 2;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                } else {
                    scoreForPlayerFive += queen * 2;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerFive += -queen;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                } else {
                    scoreForPlayerFive += queen;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                }

            }
        }


        if (playerSixSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerSix += -queen * 2;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                } else {
                    scoreForPlayerSix += queen * 2;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerSix += -queen;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                } else {
                    scoreForPlayerSix += queen;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                }
            }
        }
    }

    /**
     * This method is called when the D button is pressed.
     * It increases / decreases the score by 20 points depending
     * on whether the positiveGame checkbox is checked.
     * The increase/ decrease to the score is doubled when
     * the blindGame checkbox is checked.
     */
    public void diamonds(View view) {

        int diamond = -20;

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);
        CheckBox checkBoxBlind = (CheckBox) findViewById(R.id.blind_checkbox);
        CheckBox checkBoxPositive = (CheckBox) findViewById(R.id.plus_checkbox);

        boolean playerOneSelected = checkBoxPlayerOne.isChecked();
        boolean playerTwoSelected = checkBoxPlayerTwo.isChecked();
        boolean playerThreeSelected = checkBoxPlayerThree.isChecked();
        boolean playerFourSelected = checkBoxPlayerFour.isChecked();
        boolean playerFiveSelected = checkBoxPlayerFive.isChecked();
        boolean playerSixSelected = checkBoxPlayerSix.isChecked();
        boolean blindGame = checkBoxBlind.isChecked();
        boolean positiveGame = checkBoxPositive.isChecked();

        if (!playerOneSelected &&
                !playerTwoSelected &&
                !playerThreeSelected &&
                !playerFourSelected &&
                !playerFiveSelected &&
                !playerSixSelected) {

            Toast.makeText(this, error_message, Toast.LENGTH_SHORT).show();
            return;
        }

        if (playerOneSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerOne += -diamond * 2;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                } else {
                    scoreForPlayerOne += diamond * 2;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerOne += -diamond;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                } else {
                    scoreForPlayerOne += diamond;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                }

            }
        }

        if (playerTwoSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerTwo += -diamond * 2;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                } else {
                    scoreForPlayerTwo += diamond * 2;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerTwo += -diamond;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                } else {
                    scoreForPlayerTwo += diamond;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                }

            }
        }

        if (playerThreeSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerThree += -diamond * 2;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                } else {
                    scoreForPlayerThree += diamond * 2;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerThree += -diamond;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                } else {
                    scoreForPlayerThree += diamond;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                }

            }
        }


        if (playerFourSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerFour += -diamond * 2;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                } else {
                    scoreForPlayerFour += diamond * 2;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerFour += -diamond;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                } else {
                    scoreForPlayerFour += diamond;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                }

            }
        }


        if (playerFiveSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerFive += -diamond * 2;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                } else {
                    scoreForPlayerFive += diamond * 2;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerFive += -diamond;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                } else {
                    scoreForPlayerFive += diamond;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                }

            }
        }


        if (playerSixSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerSix += -diamond * 2;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                } else {
                    scoreForPlayerSix += diamond * 2;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerSix += -diamond;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                } else {
                    scoreForPlayerSix += diamond;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                }
            }
        }
    }

    /**
     * This method is called when the H button is pressed.
     * It increases / decreases the score by 10 points depending
     * on whether the positiveGame checkbox is checked.
     * The increase/ decrease to the score is doubled when
     * the blindGame checkbox is checked.
     */
    public void hands(View view) {

        int hand = -10;

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);
        CheckBox checkBoxBlind = (CheckBox) findViewById(R.id.blind_checkbox);
        CheckBox checkBoxPositive = (CheckBox) findViewById(R.id.plus_checkbox);

        boolean playerOneSelected = checkBoxPlayerOne.isChecked();
        boolean playerTwoSelected = checkBoxPlayerTwo.isChecked();
        boolean playerThreeSelected = checkBoxPlayerThree.isChecked();
        boolean playerFourSelected = checkBoxPlayerFour.isChecked();
        boolean playerFiveSelected = checkBoxPlayerFive.isChecked();
        boolean playerSixSelected = checkBoxPlayerSix.isChecked();
        boolean blindGame = checkBoxBlind.isChecked();
        boolean positiveGame = checkBoxPositive.isChecked();

        if (!playerOneSelected &&
                !playerTwoSelected &&
                !playerThreeSelected &&
                !playerFourSelected &&
                !playerFiveSelected &&
                !playerSixSelected) {

            Toast.makeText(this, error_message, Toast.LENGTH_SHORT).show();
            return;
        }

        if (playerOneSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerOne += -hand * 2;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                } else {
                    scoreForPlayerOne += hand * 2;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerOne += -hand;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                } else {
                    scoreForPlayerOne += hand;
                    displayScoreforPlayerOne(scoreForPlayerOne);
                }

            }
        }

        if (playerTwoSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerTwo += -hand * 2;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                } else {
                    scoreForPlayerTwo += hand * 2;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerTwo += -hand;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                } else {
                    scoreForPlayerTwo += hand;
                    displayScoreforPlayerTwo(scoreForPlayerTwo);
                }

            }
        }

        if (playerThreeSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerThree += -hand * 2;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                } else {
                    scoreForPlayerThree += hand * 2;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerThree += -hand;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                } else {
                    scoreForPlayerThree += hand;
                    displayScoreforPlayerThree(scoreForPlayerThree);
                }

            }
        }


        if (playerFourSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerFour += -hand * 2;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                } else {
                    scoreForPlayerFour += hand * 2;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerFour += -hand;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                } else {
                    scoreForPlayerFour += hand;
                    displayScoreforPlayerFour(scoreForPlayerFour);
                }

            }
        }


        if (playerFiveSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerFive += -hand * 2;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                } else {
                    scoreForPlayerFive += hand * 2;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerFive += -hand;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                } else {
                    scoreForPlayerFive += hand;
                    displayScoreforPlayerFive(scoreForPlayerFive);
                }

            }
        }


        if (playerSixSelected) {
            if (blindGame) {
                if (positiveGame) {
                    scoreForPlayerSix += -hand * 2;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                } else {
                    scoreForPlayerSix += hand * 2;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                }

            } else {
                if (positiveGame) {
                    scoreForPlayerSix += -hand;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                } else {
                    scoreForPlayerSix += hand;
                    displayScoreforPlayerSix(scoreForPlayerSix);
                }
            }
        }
    }

    /**
     * This method is called when the 1ST button is pressed.
     * It increases the score by 500 points for the player that finished all the cards first
     * in a subgame of Rentz.
     */
    public void rentzFirst(View view) {
        int rFirst = 500;

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);

        boolean playerOneSelected = checkBoxPlayerOne.isChecked();
        boolean playerTwoSelected = checkBoxPlayerTwo.isChecked();
        boolean playerThreeSelected = checkBoxPlayerThree.isChecked();
        boolean playerFourSelected = checkBoxPlayerFour.isChecked();
        boolean playerFiveSelected = checkBoxPlayerFive.isChecked();
        boolean playerSixSelected = checkBoxPlayerSix.isChecked();

        if (!playerOneSelected &&
                !playerTwoSelected &&
                !playerThreeSelected &&
                !playerFourSelected &&
                !playerFiveSelected &&
                !playerSixSelected) {

            Toast.makeText(this, error_message, Toast.LENGTH_SHORT).show();
            return;
        }

        if (playerOneSelected) {
            scoreForPlayerOne += rFirst;
            displayScoreforPlayerOne(scoreForPlayerOne);
        }

        if (playerTwoSelected) {
            scoreForPlayerTwo += rFirst;
            displayScoreforPlayerTwo(scoreForPlayerTwo);
        }

        if (playerThreeSelected) {
            scoreForPlayerThree += rFirst;
            displayScoreforPlayerThree(scoreForPlayerThree);
        }

        if (playerFourSelected) {
            scoreForPlayerFour += rFirst;
            displayScoreforPlayerFour(scoreForPlayerFour);
        }

        if (playerFiveSelected) {
            scoreForPlayerFive += rFirst;
            displayScoreforPlayerFive(scoreForPlayerFive);
        }

        if (playerSixSelected) {
            scoreForPlayerSix += rFirst;
            displayScoreforPlayerSix(scoreForPlayerSix);
        }
    }

    /**
     * This method is called when the 2ND button is pressed.
     * It increases the score by 400 points for the player that finished all the cards second
     * in a subgame of Rentz.
     */
    public void rentzSecond(View view) {
        int rSecond = 400;

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);

        boolean playerOneSelected = checkBoxPlayerOne.isChecked();
        boolean playerTwoSelected = checkBoxPlayerTwo.isChecked();
        boolean playerThreeSelected = checkBoxPlayerThree.isChecked();
        boolean playerFourSelected = checkBoxPlayerFour.isChecked();
        boolean playerFiveSelected = checkBoxPlayerFive.isChecked();
        boolean playerSixSelected = checkBoxPlayerSix.isChecked();

        if (!playerOneSelected &&
                !playerTwoSelected &&
                !playerThreeSelected &&
                !playerFourSelected &&
                !playerFiveSelected &&
                !playerSixSelected) {

            Toast.makeText(this, error_message, Toast.LENGTH_SHORT).show();
            return;
        }

        if (playerOneSelected) {
            scoreForPlayerOne += rSecond;
            displayScoreforPlayerOne(scoreForPlayerOne);
        }

        if (playerTwoSelected) {
            scoreForPlayerTwo += rSecond;
            displayScoreforPlayerTwo(scoreForPlayerTwo);
        }

        if (playerThreeSelected) {
            scoreForPlayerThree += rSecond;
            displayScoreforPlayerThree(scoreForPlayerThree);
        }

        if (playerFourSelected) {
            scoreForPlayerFour += rSecond;
            displayScoreforPlayerFour(scoreForPlayerFour);
        }

        if (playerFiveSelected) {
            scoreForPlayerFive += rSecond;
            displayScoreforPlayerFive(scoreForPlayerFive);
        }

        if (playerSixSelected) {
            scoreForPlayerSix += rSecond;
            displayScoreforPlayerSix(scoreForPlayerSix);
        }
    }

    /**
     * This method is called when the 3RD button is pressed.
     * It increases the score by 300 points for the player that finished all the cards third
     * in a subgame of Rentz.
     */
    public void rentzThird(View view) {
        int rThird = 300;

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);

        boolean playerOneSelected = checkBoxPlayerOne.isChecked();
        boolean playerTwoSelected = checkBoxPlayerTwo.isChecked();
        boolean playerThreeSelected = checkBoxPlayerThree.isChecked();
        boolean playerFourSelected = checkBoxPlayerFour.isChecked();
        boolean playerFiveSelected = checkBoxPlayerFive.isChecked();
        boolean playerSixSelected = checkBoxPlayerSix.isChecked();

        if (!playerOneSelected &&
                !playerTwoSelected &&
                !playerThreeSelected &&
                !playerFourSelected &&
                !playerFiveSelected &&
                !playerSixSelected) {

            Toast.makeText(this, error_message, Toast.LENGTH_SHORT).show();
            return;
        }

        if (playerOneSelected) {
            scoreForPlayerOne += rThird;
            displayScoreforPlayerOne(scoreForPlayerOne);
        }

        if (playerTwoSelected) {
            scoreForPlayerTwo += rThird;
            displayScoreforPlayerTwo(scoreForPlayerTwo);
        }

        if (playerThreeSelected) {
            scoreForPlayerThree += rThird;
            displayScoreforPlayerThree(scoreForPlayerThree);
        }

        if (playerFourSelected) {
            scoreForPlayerFour += rThird;
            displayScoreforPlayerFour(scoreForPlayerFour);
        }

        if (playerFiveSelected) {
            scoreForPlayerFive += rThird;
            displayScoreforPlayerFive(scoreForPlayerFive);
        }

        if (playerSixSelected) {
            scoreForPlayerSix += rThird;
            displayScoreforPlayerSix(scoreForPlayerSix);
        }
    }

    /**
     * This method is called when the 4TH button is pressed.
     * It increases the score by 200 points for the player that finished all the cards fourth
     * in a subgame of Rentz.
     */
    public void rentzFourth(View view) {
        int rFourth = 200;

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);

        boolean playerOneSelected = checkBoxPlayerOne.isChecked();
        boolean playerTwoSelected = checkBoxPlayerTwo.isChecked();
        boolean playerThreeSelected = checkBoxPlayerThree.isChecked();
        boolean playerFourSelected = checkBoxPlayerFour.isChecked();
        boolean playerFiveSelected = checkBoxPlayerFive.isChecked();
        boolean playerSixSelected = checkBoxPlayerSix.isChecked();

        if (!playerOneSelected &&
                !playerTwoSelected &&
                !playerThreeSelected &&
                !playerFourSelected &&
                !playerFiveSelected &&
                !playerSixSelected) {

            Toast.makeText(this, error_message, Toast.LENGTH_SHORT).show();
            return;
        }

        if (playerOneSelected) {
            scoreForPlayerOne += rFourth;
            displayScoreforPlayerOne(scoreForPlayerOne);
        }

        if (playerTwoSelected) {
            scoreForPlayerTwo += rFourth;
            displayScoreforPlayerTwo(scoreForPlayerTwo);
        }

        if (playerThreeSelected) {
            scoreForPlayerThree += rFourth;
            displayScoreforPlayerThree(scoreForPlayerThree);
        }

        if (playerFourSelected) {
            scoreForPlayerFour += rFourth;
            displayScoreforPlayerFour(scoreForPlayerFour);
        }

        if (playerFiveSelected) {
            scoreForPlayerFive += rFourth;
            displayScoreforPlayerFive(scoreForPlayerFive);
        }

        if (playerSixSelected) {
            scoreForPlayerSix += rFourth;
            displayScoreforPlayerSix(scoreForPlayerSix);
        }
    }

    /**
     * This method is called when the 5TH button is pressed.
     * It increases the score by 100 points for the player that finished all the cards fifth
     * in a subgame of Rentz.
     */
    public void rentzFifth(View view) {
        int rFifth = 100;

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);

        boolean playerOneSelected = checkBoxPlayerOne.isChecked();
        boolean playerTwoSelected = checkBoxPlayerTwo.isChecked();
        boolean playerThreeSelected = checkBoxPlayerThree.isChecked();
        boolean playerFourSelected = checkBoxPlayerFour.isChecked();
        boolean playerFiveSelected = checkBoxPlayerFive.isChecked();
        boolean playerSixSelected = checkBoxPlayerSix.isChecked();

        if (!playerOneSelected &&
                !playerTwoSelected &&
                !playerThreeSelected &&
                !playerFourSelected &&
                !playerFiveSelected &&
                !playerSixSelected) {

            Toast.makeText(this, error_message, Toast.LENGTH_SHORT).show();
            return;
        }

        if (playerOneSelected) {
            scoreForPlayerOne += rFifth;
            displayScoreforPlayerOne(scoreForPlayerOne);
        }

        if (playerTwoSelected) {
            scoreForPlayerTwo += rFifth;
            displayScoreforPlayerTwo(scoreForPlayerTwo);
        }

        if (playerThreeSelected) {
            scoreForPlayerThree += rFifth;
            displayScoreforPlayerThree(scoreForPlayerThree);
        }

        if (playerFourSelected) {
            scoreForPlayerFour += rFifth;
            displayScoreforPlayerFour(scoreForPlayerFour);
        }

        if (playerFiveSelected) {
            scoreForPlayerFive += rFifth;
            displayScoreforPlayerFive(scoreForPlayerFive);
        }

        if (playerSixSelected) {
            scoreForPlayerSix += rFifth;
            displayScoreforPlayerSix(scoreForPlayerSix);
        }
    }

    /**
     * Resets the scores to zero, the player names to defaults
     * and checkboxes to be unchecked.
     */
    public void setScoreToZero(View view) {
        scoreForPlayerOne = 0;
        displayScoreforPlayerOne(scoreForPlayerOne);
        scoreForPlayerTwo = 0;
        displayScoreforPlayerTwo(scoreForPlayerTwo);
        scoreForPlayerThree = 0;
        displayScoreforPlayerThree(scoreForPlayerThree);
        scoreForPlayerFour = 0;
        displayScoreforPlayerFour(scoreForPlayerFour);
        scoreForPlayerFive = 0;
        displayScoreforPlayerFive(scoreForPlayerFive);
        scoreForPlayerSix = 0;
        displayScoreforPlayerSix(scoreForPlayerSix);

        CheckBox checkBoxPlayerOne = (CheckBox) findViewById(R.id.player_1_checkbox);
        CheckBox checkBoxPlayerTwo = (CheckBox) findViewById(R.id.player_2_checkbox);
        CheckBox checkBoxPlayerThree = (CheckBox) findViewById(R.id.player_3_checkbox);
        CheckBox checkBoxPlayerFour = (CheckBox) findViewById(R.id.player_4_checkbox);
        CheckBox checkBoxPlayerFive = (CheckBox) findViewById(R.id.player_5_checkbox);
        CheckBox checkBoxPlayerSix = (CheckBox) findViewById(R.id.player_6_checkbox);
        CheckBox checkBoxBlind = (CheckBox) findViewById(R.id.blind_checkbox);
        CheckBox checkBoxPositive = (CheckBox) findViewById(R.id.plus_checkbox);
        checkBoxPlayerOne.setChecked(false);
        checkBoxPlayerTwo.setChecked(false);
        checkBoxPlayerThree.setChecked(false);
        checkBoxPlayerFour.setChecked(false);
        checkBoxPlayerFive.setChecked(false);
        checkBoxPlayerSix.setChecked(false);
        checkBoxBlind.setChecked(false);
        checkBoxPositive.setChecked(false);

        EditText playerOneName = (EditText) findViewById(R.id.player_1_view);
        playerOneName.setText("Player 1");
        EditText playerTwoName = (EditText) findViewById(R.id.player_2_view);
        playerTwoName.setText("Player 2");
        EditText playerThreeName = (EditText) findViewById(R.id.player_3_view);
        playerThreeName.setText("Player 3");
        EditText playerFourName = (EditText) findViewById(R.id.player_4_view);
        playerFourName.setText("Player 4");
        EditText playerFiveName = (EditText) findViewById(R.id.player_5_view);
        playerFiveName.setText("Player 5");
        EditText playerSixName = (EditText) findViewById(R.id.player_6_view);
        playerSixName.setText("Player 6");
    }


    /**
     * Displays the given score for player one.
     */
    private void displayScoreforPlayerOne(int number) {
        TextView playerOneScoreTextView = (TextView) findViewById(R.id.player_1_score);
        playerOneScoreTextView.setText("" + scoreForPlayerOne);
    }

    /**
     * Displays the given score for player two.
     */
    private void displayScoreforPlayerTwo(int number) {
        TextView playerTwoScoreTextView = (TextView) findViewById(R.id.player_2_score);
        playerTwoScoreTextView.setText("" + scoreForPlayerTwo);
    }

    /**
     * Displays the given score for player three.
     */
    private void displayScoreforPlayerThree(int number) {
        TextView playerThreeScoreTextView = (TextView) findViewById(R.id.player_3_score);
        playerThreeScoreTextView.setText("" + scoreForPlayerThree);
    }

    /**
     * Displays the given score for player four.
     */
    private void displayScoreforPlayerFour(int number) {
        TextView playerFourScoreTextView = (TextView) findViewById(R.id.player_4_score);
        playerFourScoreTextView.setText("" + scoreForPlayerFour);
    }

    /**
     * Displays the given score for player five.
     */
    private void displayScoreforPlayerFive(int number) {
        TextView playerFiveScoreTextView = (TextView) findViewById(R.id.player_5_score);
        playerFiveScoreTextView.setText("" + scoreForPlayerFive);
    }

    /**
     * Displays the given score for player six.
     */
    private void displayScoreforPlayerSix(int number) {
        TextView playerSixScoreTextView = (TextView) findViewById(R.id.player_6_score);
        playerSixScoreTextView.setText("" + scoreForPlayerSix);
    }


}
