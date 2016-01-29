package tbclient.KillAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AK_CMD = "";
    public static final String DEFAULT_AK_SIGN = "";
    public static final String DEFAULT_AK_TAG = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ak_cmd;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ak_sign;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ak_tag;
    @ProtoField(tag = 1)
    public final CommonReq common;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.ak_tag == null) {
                this.ak_tag = "";
            } else {
                this.ak_tag = builder.ak_tag;
            }
            if (builder.ak_cmd == null) {
                this.ak_cmd = "";
            } else {
                this.ak_cmd = builder.ak_cmd;
            }
            if (builder.ak_sign == null) {
                this.ak_sign = "";
                return;
            } else {
                this.ak_sign = builder.ak_sign;
                return;
            }
        }
        this.common = builder.common;
        this.ak_tag = builder.ak_tag;
        this.ak_cmd = builder.ak_cmd;
        this.ak_sign = builder.ak_sign;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String ak_cmd;
        public String ak_sign;
        public String ak_tag;
        public CommonReq common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.ak_tag = dataReq.ak_tag;
                this.ak_cmd = dataReq.ak_cmd;
                this.ak_sign = dataReq.ak_sign;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
