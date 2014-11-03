package tbclient.XiubaExchange;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_PASSWORD = "";
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String password;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long tdouNum;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long xiubaUserId;
    public static final Long DEFAULT_XIUBAUSERID = 0L;
    public static final Long DEFAULT_TDOUNUM = 0L;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.xiubaUserId == null) {
                this.xiubaUserId = DEFAULT_XIUBAUSERID;
            } else {
                this.xiubaUserId = builder.xiubaUserId;
            }
            if (builder.tdouNum == null) {
                this.tdouNum = DEFAULT_TDOUNUM;
            } else {
                this.tdouNum = builder.tdouNum;
            }
            if (builder.password == null) {
                this.password = "";
                return;
            } else {
                this.password = builder.password;
                return;
            }
        }
        this.common = builder.common;
        this.xiubaUserId = builder.xiubaUserId;
        this.tdouNum = builder.tdouNum;
        this.password = builder.password;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public String password;
        public Long tdouNum;
        public Long xiubaUserId;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.xiubaUserId = dataReq.xiubaUserId;
                this.tdouNum = dataReq.tdouNum;
                this.password = dataReq.password;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
