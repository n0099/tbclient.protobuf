package tbclient.CompleteTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_COMPELETE_ID = "";
    public static final String DEFAULT_SHOUBAICUID = "";
    public static final String DEFAULT_TOKEN = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68538common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String compelete_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String shoubaicuid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String token;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68539common;
        public String compelete_id;
        public String shoubaicuid;
        public String token;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68539common = dataReq.f68538common;
            this.shoubaicuid = dataReq.shoubaicuid;
            this.compelete_id = dataReq.compelete_id;
            this.token = dataReq.token;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f68538common = builder.f68539common;
            String str = builder.shoubaicuid;
            if (str == null) {
                this.shoubaicuid = "";
            } else {
                this.shoubaicuid = str;
            }
            String str2 = builder.compelete_id;
            if (str2 == null) {
                this.compelete_id = "";
            } else {
                this.compelete_id = str2;
            }
            String str3 = builder.token;
            if (str3 == null) {
                this.token = "";
                return;
            } else {
                this.token = str3;
                return;
            }
        }
        this.f68538common = builder.f68539common;
        this.shoubaicuid = builder.shoubaicuid;
        this.compelete_id = builder.compelete_id;
        this.token = builder.token;
    }
}
