package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AigcFeedbackInfo extends Message {
    public static final String DEFAULT_AIGC_CHAT_ID = "";
    public static final Integer DEFAULT_FEEDBACK_FOLD = 0;
    public static final String DEFAULT_FEEDBACK_FOLD_TIP = "";
    public static final String DEFAULT_FEEDBACK_URL = "";
    public static final String DEFAULT_NEGATIVE_TEXT = "";
    public static final String DEFAULT_POSITIVE_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String aigc_chat_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer feedback_fold;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String feedback_fold_tip;
    @ProtoField(tag = 7)
    public final Toast feedback_toast;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String feedback_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String negative_text;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String positive_text;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AigcFeedbackInfo> {
        public String aigc_chat_id;
        public Integer feedback_fold;
        public String feedback_fold_tip;
        public Toast feedback_toast;
        public String feedback_url;
        public String negative_text;
        public String positive_text;

        public Builder() {
        }

        public Builder(AigcFeedbackInfo aigcFeedbackInfo) {
            super(aigcFeedbackInfo);
            if (aigcFeedbackInfo == null) {
                return;
            }
            this.aigc_chat_id = aigcFeedbackInfo.aigc_chat_id;
            this.feedback_fold = aigcFeedbackInfo.feedback_fold;
            this.feedback_fold_tip = aigcFeedbackInfo.feedback_fold_tip;
            this.positive_text = aigcFeedbackInfo.positive_text;
            this.negative_text = aigcFeedbackInfo.negative_text;
            this.feedback_url = aigcFeedbackInfo.feedback_url;
            this.feedback_toast = aigcFeedbackInfo.feedback_toast;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AigcFeedbackInfo build(boolean z) {
            return new AigcFeedbackInfo(this, z);
        }
    }

    public AigcFeedbackInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.aigc_chat_id;
            if (str == null) {
                this.aigc_chat_id = "";
            } else {
                this.aigc_chat_id = str;
            }
            Integer num = builder.feedback_fold;
            if (num == null) {
                this.feedback_fold = DEFAULT_FEEDBACK_FOLD;
            } else {
                this.feedback_fold = num;
            }
            String str2 = builder.feedback_fold_tip;
            if (str2 == null) {
                this.feedback_fold_tip = "";
            } else {
                this.feedback_fold_tip = str2;
            }
            String str3 = builder.positive_text;
            if (str3 == null) {
                this.positive_text = "";
            } else {
                this.positive_text = str3;
            }
            String str4 = builder.negative_text;
            if (str4 == null) {
                this.negative_text = "";
            } else {
                this.negative_text = str4;
            }
            String str5 = builder.feedback_url;
            if (str5 == null) {
                this.feedback_url = "";
            } else {
                this.feedback_url = str5;
            }
            this.feedback_toast = builder.feedback_toast;
            return;
        }
        this.aigc_chat_id = builder.aigc_chat_id;
        this.feedback_fold = builder.feedback_fold;
        this.feedback_fold_tip = builder.feedback_fold_tip;
        this.positive_text = builder.positive_text;
        this.negative_text = builder.negative_text;
        this.feedback_url = builder.feedback_url;
        this.feedback_toast = builder.feedback_toast;
    }
}
