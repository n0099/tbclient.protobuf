package tbclient.GetInfluenceRank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes21.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TIEBA_NAME = "";
    @ProtoField(tag = 6)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5226common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_name;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_PN = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tieba_name == null) {
                this.tieba_name = "";
            } else {
                this.tieba_name = builder.tieba_name;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            this.f5226common = builder.f5227common;
            return;
        }
        this.tieba_name = builder.tieba_name;
        this.forum_id = builder.forum_id;
        this.rn = builder.rn;
        this.pn = builder.pn;
        this.f5226common = builder.f5227common;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5227common;
        public Long forum_id;
        public Integer pn;
        public Integer rn;
        public String tieba_name;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.tieba_name = dataReq.tieba_name;
                this.forum_id = dataReq.forum_id;
                this.rn = dataReq.rn;
                this.pn = dataReq.pn;
                this.f5227common = dataReq.f5226common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
