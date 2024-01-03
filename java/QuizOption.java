package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class QuizOption extends Message {
    public static final String DEFAULT_BUTTON_IMG = "";
    public static final String DEFAULT_BUTTON_TEXT_NO = "";
    public static final String DEFAULT_BUTTON_TEXT_SUP = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_QUIZ_OPTION = "";
    public static final Long DEFAULT_QUIZ_OPTION_ID = 0L;
    public static final Long DEFAULT_TOTAL_USER_COUNT = 0L;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String button_img;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String button_text_no;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String button_text_sup;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String quiz_option;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long quiz_option_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long total_user_count;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<QuizOption> {
        public String button_img;
        public String button_text_no;
        public String button_text_sup;
        public String icon;
        public String quiz_option;
        public Long quiz_option_id;
        public Long total_user_count;

        public Builder() {
        }

        public Builder(QuizOption quizOption) {
            super(quizOption);
            if (quizOption == null) {
                return;
            }
            this.quiz_option_id = quizOption.quiz_option_id;
            this.quiz_option = quizOption.quiz_option;
            this.icon = quizOption.icon;
            this.total_user_count = quizOption.total_user_count;
            this.button_img = quizOption.button_img;
            this.button_text_sup = quizOption.button_text_sup;
            this.button_text_no = quizOption.button_text_no;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public QuizOption build(boolean z) {
            return new QuizOption(this, z);
        }
    }

    public QuizOption(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.quiz_option_id;
            if (l == null) {
                this.quiz_option_id = DEFAULT_QUIZ_OPTION_ID;
            } else {
                this.quiz_option_id = l;
            }
            String str = builder.quiz_option;
            if (str == null) {
                this.quiz_option = "";
            } else {
                this.quiz_option = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            Long l2 = builder.total_user_count;
            if (l2 == null) {
                this.total_user_count = DEFAULT_TOTAL_USER_COUNT;
            } else {
                this.total_user_count = l2;
            }
            String str3 = builder.button_img;
            if (str3 == null) {
                this.button_img = "";
            } else {
                this.button_img = str3;
            }
            String str4 = builder.button_text_sup;
            if (str4 == null) {
                this.button_text_sup = "";
            } else {
                this.button_text_sup = str4;
            }
            String str5 = builder.button_text_no;
            if (str5 == null) {
                this.button_text_no = "";
                return;
            } else {
                this.button_text_no = str5;
                return;
            }
        }
        this.quiz_option_id = builder.quiz_option_id;
        this.quiz_option = builder.quiz_option;
        this.icon = builder.icon;
        this.total_user_count = builder.total_user_count;
        this.button_img = builder.button_img;
        this.button_text_sup = builder.button_text_sup;
        this.button_text_no = builder.button_text_no;
    }
}
