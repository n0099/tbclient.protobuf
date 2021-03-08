package tbclient.CompleteTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_COMPELETE_ID = "";
    public static final String DEFAULT_SHOUBAICUID = "";
    public static final String DEFAULT_TOKEN = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f8669common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String compelete_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String shoubaicuid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String token;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f8669common = builder.f8670common;
            if (builder.shoubaicuid == null) {
                this.shoubaicuid = "";
            } else {
                this.shoubaicuid = builder.shoubaicuid;
            }
            if (builder.compelete_id == null) {
                this.compelete_id = "";
            } else {
                this.compelete_id = builder.compelete_id;
            }
            if (builder.token == null) {
                this.token = "";
                return;
            } else {
                this.token = builder.token;
                return;
            }
        }
        this.f8669common = builder.f8670common;
        this.shoubaicuid = builder.shoubaicuid;
        this.compelete_id = builder.compelete_id;
        this.token = builder.token;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f8670common;
        public String compelete_id;
        public String shoubaicuid;
        public String token;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f8670common = dataReq.f8669common;
                this.shoubaicuid = dataReq.shoubaicuid;
                this.compelete_id = dataReq.compelete_id;
                this.token = dataReq.token;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
