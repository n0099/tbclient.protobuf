package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class QuizInfo extends Message {
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TOTAL_COUNT_ICON = "";
    public static final String DEFAULT_TOTAL_COUNT_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long bonus_type;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long browse_user_option;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long min_pour_count;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<QuizOption> options;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long product;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long quiz_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long total_count;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String total_count_icon;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String total_count_text;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long total_user_count;
    @ProtoField(tag = 12, type = Message.Datatype.INT64)
    public final Long type;
    public static final Long DEFAULT_BONUS_TYPE = 0L;
    public static final Long DEFAULT_TOTAL_COUNT = 0L;
    public static final Long DEFAULT_TOTAL_USER_COUNT = 0L;
    public static final Long DEFAULT_MIN_POUR_COUNT = 0L;
    public static final Long DEFAULT_QUIZ_ID = 0L;
    public static final Long DEFAULT_BROWSE_USER_OPTION = 0L;
    public static final Long DEFAULT_PRODUCT = 0L;
    public static final List<QuizOption> DEFAULT_OPTIONS = Collections.emptyList();
    public static final Long DEFAULT_TYPE = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<QuizInfo> {
        public Long bonus_type;
        public Long browse_user_option;
        public Long min_pour_count;
        public List<QuizOption> options;
        public Long product;
        public Long quiz_id;
        public String title;
        public Long total_count;
        public String total_count_icon;
        public String total_count_text;
        public Long total_user_count;
        public Long type;

        public Builder() {
        }

        public Builder(QuizInfo quizInfo) {
            super(quizInfo);
            if (quizInfo == null) {
                return;
            }
            this.bonus_type = quizInfo.bonus_type;
            this.title = quizInfo.title;
            this.total_count_icon = quizInfo.total_count_icon;
            this.total_count_text = quizInfo.total_count_text;
            this.total_count = quizInfo.total_count;
            this.total_user_count = quizInfo.total_user_count;
            this.min_pour_count = quizInfo.min_pour_count;
            this.quiz_id = quizInfo.quiz_id;
            this.browse_user_option = quizInfo.browse_user_option;
            this.product = quizInfo.product;
            this.options = Message.copyOf(quizInfo.options);
            this.type = quizInfo.type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public QuizInfo build(boolean z) {
            return new QuizInfo(this, z);
        }
    }

    public QuizInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.bonus_type;
            if (l == null) {
                this.bonus_type = DEFAULT_BONUS_TYPE;
            } else {
                this.bonus_type = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.total_count_icon;
            if (str2 == null) {
                this.total_count_icon = "";
            } else {
                this.total_count_icon = str2;
            }
            String str3 = builder.total_count_text;
            if (str3 == null) {
                this.total_count_text = "";
            } else {
                this.total_count_text = str3;
            }
            Long l2 = builder.total_count;
            if (l2 == null) {
                this.total_count = DEFAULT_TOTAL_COUNT;
            } else {
                this.total_count = l2;
            }
            Long l3 = builder.total_user_count;
            if (l3 == null) {
                this.total_user_count = DEFAULT_TOTAL_USER_COUNT;
            } else {
                this.total_user_count = l3;
            }
            Long l4 = builder.min_pour_count;
            if (l4 == null) {
                this.min_pour_count = DEFAULT_MIN_POUR_COUNT;
            } else {
                this.min_pour_count = l4;
            }
            Long l5 = builder.quiz_id;
            if (l5 == null) {
                this.quiz_id = DEFAULT_QUIZ_ID;
            } else {
                this.quiz_id = l5;
            }
            Long l6 = builder.browse_user_option;
            if (l6 == null) {
                this.browse_user_option = DEFAULT_BROWSE_USER_OPTION;
            } else {
                this.browse_user_option = l6;
            }
            Long l7 = builder.product;
            if (l7 == null) {
                this.product = DEFAULT_PRODUCT;
            } else {
                this.product = l7;
            }
            List<QuizOption> list = builder.options;
            if (list == null) {
                this.options = DEFAULT_OPTIONS;
            } else {
                this.options = Message.immutableCopyOf(list);
            }
            Long l8 = builder.type;
            if (l8 == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = l8;
                return;
            }
        }
        this.bonus_type = builder.bonus_type;
        this.title = builder.title;
        this.total_count_icon = builder.total_count_icon;
        this.total_count_text = builder.total_count_text;
        this.total_count = builder.total_count;
        this.total_user_count = builder.total_user_count;
        this.min_pour_count = builder.min_pour_count;
        this.quiz_id = builder.quiz_id;
        this.browse_user_option = builder.browse_user_option;
        this.product = builder.product;
        this.options = Message.immutableCopyOf(builder.options);
        this.type = builder.type;
    }
}
