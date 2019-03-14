package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class PriManagerApplyInfo extends Message {
    public static final String DEFAULT_ASSIST_APPLY_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer assist_apply_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String assist_apply_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer assist_left_num;
    public static final Integer DEFAULT_ASSIST_LEFT_NUM = 0;
    public static final Integer DEFAULT_ASSIST_APPLY_STATUS = 0;

    private PriManagerApplyInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.assist_left_num == null) {
                this.assist_left_num = DEFAULT_ASSIST_LEFT_NUM;
            } else {
                this.assist_left_num = builder.assist_left_num;
            }
            if (builder.assist_apply_url == null) {
                this.assist_apply_url = "";
            } else {
                this.assist_apply_url = builder.assist_apply_url;
            }
            if (builder.assist_apply_status == null) {
                this.assist_apply_status = DEFAULT_ASSIST_APPLY_STATUS;
                return;
            } else {
                this.assist_apply_status = builder.assist_apply_status;
                return;
            }
        }
        this.assist_left_num = builder.assist_left_num;
        this.assist_apply_url = builder.assist_apply_url;
        this.assist_apply_status = builder.assist_apply_status;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<PriManagerApplyInfo> {
        public Integer assist_apply_status;
        public String assist_apply_url;
        public Integer assist_left_num;

        public Builder() {
        }

        public Builder(PriManagerApplyInfo priManagerApplyInfo) {
            super(priManagerApplyInfo);
            if (priManagerApplyInfo != null) {
                this.assist_left_num = priManagerApplyInfo.assist_left_num;
                this.assist_apply_url = priManagerApplyInfo.assist_apply_url;
                this.assist_apply_status = priManagerApplyInfo.assist_apply_status;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PriManagerApplyInfo build(boolean z) {
            return new PriManagerApplyInfo(this, z);
        }
    }
}