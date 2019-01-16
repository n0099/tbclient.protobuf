package tbclient.CompleteTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_COMPELETE_ID = "";
    public static final String DEFAULT_SHOUBAICUID = "";
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String compelete_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String shoubaicuid;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.shoubaicuid == null) {
                this.shoubaicuid = "";
            } else {
                this.shoubaicuid = builder.shoubaicuid;
            }
            if (builder.compelete_id == null) {
                this.compelete_id = "";
                return;
            } else {
                this.compelete_id = builder.compelete_id;
                return;
            }
        }
        this.common = builder.common;
        this.shoubaicuid = builder.shoubaicuid;
        this.compelete_id = builder.compelete_id;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public String compelete_id;
        public String shoubaicuid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.shoubaicuid = dataReq.shoubaicuid;
                this.compelete_id = dataReq.compelete_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}