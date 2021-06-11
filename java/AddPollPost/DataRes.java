package tbclient.AddPollPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_ERROR_CODE = 0;
    public static final String DEFAULT_ERROR_MSG = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer error_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String error_msg;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer error_code;
        public String error_msg;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.error_code = dataRes.error_code;
            this.error_msg = dataRes.error_msg;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.error_code;
            if (num == null) {
                this.error_code = DEFAULT_ERROR_CODE;
            } else {
                this.error_code = num;
            }
            String str = builder.error_msg;
            if (str == null) {
                this.error_msg = "";
                return;
            } else {
                this.error_msg = str;
                return;
            }
        }
        this.error_code = builder.error_code;
        this.error_msg = builder.error_msg;
    }
}
