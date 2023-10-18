package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class QuizCard extends Message {
    @ProtoField(tag = 4)
    public final LinkConf bottom;
    @ProtoField(tag = 2)
    public final ThemeColorInfo card_background;
    @ProtoField(tag = 1)
    public final PubCardFreq freq;
    @ProtoField(tag = 5)
    public final QuizInfo quiz;
    @ProtoField(tag = 3)
    public final QuizCardTopConf top;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<QuizCard> {
        public LinkConf bottom;
        public ThemeColorInfo card_background;
        public PubCardFreq freq;
        public QuizInfo quiz;
        public QuizCardTopConf top;

        public Builder() {
        }

        public Builder(QuizCard quizCard) {
            super(quizCard);
            if (quizCard == null) {
                return;
            }
            this.freq = quizCard.freq;
            this.card_background = quizCard.card_background;
            this.top = quizCard.top;
            this.bottom = quizCard.bottom;
            this.quiz = quizCard.quiz;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public QuizCard build(boolean z) {
            return new QuizCard(this, z);
        }
    }

    public QuizCard(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.freq = builder.freq;
            this.card_background = builder.card_background;
            this.top = builder.top;
            this.bottom = builder.bottom;
            this.quiz = builder.quiz;
            return;
        }
        this.freq = builder.freq;
        this.card_background = builder.card_background;
        this.top = builder.top;
        this.bottom = builder.bottom;
        this.quiz = builder.quiz;
    }
}
