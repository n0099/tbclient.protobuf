package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class QuizCardTopConf extends Message {
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 1)
    public final ThemeColorInfo img;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<QuizCardTopConf> {
        public ThemeColorInfo img;
        public String text;

        public Builder() {
        }

        public Builder(QuizCardTopConf quizCardTopConf) {
            super(quizCardTopConf);
            if (quizCardTopConf == null) {
                return;
            }
            this.img = quizCardTopConf.img;
            this.text = quizCardTopConf.text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public QuizCardTopConf build(boolean z) {
            return new QuizCardTopConf(this, z);
        }
    }

    public QuizCardTopConf(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.img = builder.img;
            String str = builder.text;
            if (str == null) {
                this.text = "";
                return;
            } else {
                this.text = str;
                return;
            }
        }
        this.img = builder.img;
        this.text = builder.text;
    }
}
