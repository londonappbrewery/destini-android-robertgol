package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton, mBottomButton;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                step(true);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                step(false);
            }
        });
    }

    private void step(boolean decision)
    {
        //top - true / bottom - false

        if (mStoryIndex == 1 && decision)
        {
            //T3 story
            mStoryIndex = 3;
            mStoryTextView.setText(R.string.T3_Story);
            mTopButton.setText(R.string.T3_Ans1);
            mBottomButton.setText(R.string.T3_Ans2);
            return;
        } else if (mStoryIndex == 1)
        {
            //T2 story
            mStoryIndex = 2;
            mStoryTextView.setText(R.string.T2_Story);
            mTopButton.setText(R.string.T2_Ans1);
            mBottomButton.setText(R.string.T2_Ans2);
            return;
        }

        if (mStoryIndex == 3 && decision)
        {
            //T6 End
            mStoryTextView.setText(R.string.T6_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
            return;
        } else if (mStoryIndex == 3)
        {
            //T5 end
            mStoryTextView.setText(R.string.T5_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
            return;
        }

        if (mStoryIndex == 2 && decision)
        {
            //T3 Story
            mStoryIndex = 3;
            mStoryTextView.setText(R.string.T3_Story);
            mTopButton.setText(R.string.T3_Ans1);
            mBottomButton.setText(R.string.T3_Ans2);
        } else
        {
            //T4 end
            mStoryTextView.setText(R.string.T4_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
    }
}
