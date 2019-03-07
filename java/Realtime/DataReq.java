package tbclient.Realtime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ABTEST_TAG = "";
    public static final String DEFAULT_SOURCE = "";
    public static final String DEFAULT_WEIGHT = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String abtest_tag;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer location;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String source;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String weight;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_LOCATION = 0;
    public static final Integer DEFAULT_TYPE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.weight == null) {
                this.weight = "";
            } else {
                this.weight = builder.weight;
            }
            if (builder.source == null) {
                this.source = "";
            } else {
                this.source = builder.source;
            }
            if (builder.location == null) {
                this.location = DEFAULT_LOCATION;
            } else {
                this.location = builder.location;
            }
            if (builder.abtest_tag == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = builder.abtest_tag;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = builder.type;
                return;
            }
        }
        this.common = builder.common;
        this.tid = builder.tid;
        this.weight = builder.weight;
        this.source = builder.source;
        this.location = builder.location;
        this.abtest_tag = builder.abtest_tag;
        this.type = builder.type;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String abtest_tag;
        public CommonReq common;
        public Integer location;
        public String source;
        public Long tid;
        public Integer type;
        public String weight;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.tid = dataReq.tid;
                this.weight = dataReq.weight;
                this.source = dataReq.source;
                this.location = dataReq.location;
                this.abtest_tag = dataReq.abtest_tag;
                this.type = dataReq.type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
