package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68554common;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long excid;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long q_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long scr_dip;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long scr_w;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long tag_code;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long thread_id;
    public static final Long DEFAULT_SCR_W = 0L;
    public static final Long DEFAULT_SCR_H = 0L;
    public static final Long DEFAULT_SCR_DIP = 0L;
    public static final Long DEFAULT_Q_TYPE = 0L;
    public static final Long DEFAULT_EXCID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_TAG_CODE = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68555common;
        public Long excid;
        public Long q_type;
        public Long scr_dip;
        public Long scr_h;
        public Long scr_w;
        public Long tag_code;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68555common = dataReq.f68554common;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.excid = dataReq.excid;
            this.thread_id = dataReq.thread_id;
            this.tag_code = dataReq.tag_code;
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
            this.f68554common = builder.f68555common;
            Long l = builder.scr_w;
            if (l == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = l;
            }
            Long l2 = builder.scr_h;
            if (l2 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = l2;
            }
            Long l3 = builder.scr_dip;
            if (l3 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = l3;
            }
            Long l4 = builder.q_type;
            if (l4 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = l4;
            }
            Long l5 = builder.excid;
            if (l5 == null) {
                this.excid = DEFAULT_EXCID;
            } else {
                this.excid = l5;
            }
            Long l6 = builder.thread_id;
            if (l6 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l6;
            }
            Long l7 = builder.tag_code;
            if (l7 == null) {
                this.tag_code = DEFAULT_TAG_CODE;
                return;
            } else {
                this.tag_code = l7;
                return;
            }
        }
        this.f68554common = builder.f68555common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.excid = builder.excid;
        this.thread_id = builder.thread_id;
        this.tag_code = builder.tag_code;
    }
}
