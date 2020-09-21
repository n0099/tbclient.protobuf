package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class HeadSdk extends Message {
    public static final String DEFAULT_HEAD_PIC = "";
    public static final String DEFAULT_HEAD_TEXT = "";
    public static final Integer DEFAULT_HEAD_TYPE = 0;
    public static final String DEFAULT_SDK_NAME = "";
    public static final String DEFAULT_SDK_PARAMS = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String head_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String head_text;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer head_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String sdk_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String sdk_params;

    private HeadSdk(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.head_pic == null) {
                this.head_pic = "";
            } else {
                this.head_pic = builder.head_pic;
            }
            if (builder.head_text == null) {
                this.head_text = "";
            } else {
                this.head_text = builder.head_text;
            }
            if (builder.sdk_name == null) {
                this.sdk_name = "";
            } else {
                this.sdk_name = builder.sdk_name;
            }
            if (builder.sdk_params == null) {
                this.sdk_params = "";
            } else {
                this.sdk_params = builder.sdk_params;
            }
            if (builder.head_type == null) {
                this.head_type = DEFAULT_HEAD_TYPE;
                return;
            } else {
                this.head_type = builder.head_type;
                return;
            }
        }
        this.head_pic = builder.head_pic;
        this.head_text = builder.head_text;
        this.sdk_name = builder.sdk_name;
        this.sdk_params = builder.sdk_params;
        this.head_type = builder.head_type;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<HeadSdk> {
        public String head_pic;
        public String head_text;
        public Integer head_type;
        public String sdk_name;
        public String sdk_params;

        public Builder() {
        }

        public Builder(HeadSdk headSdk) {
            super(headSdk);
            if (headSdk != null) {
                this.head_pic = headSdk.head_pic;
                this.head_text = headSdk.head_text;
                this.sdk_name = headSdk.sdk_name;
                this.sdk_params = headSdk.sdk_params;
                this.head_type = headSdk.head_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeadSdk build(boolean z) {
            return new HeadSdk(this, z);
        }
    }
}
