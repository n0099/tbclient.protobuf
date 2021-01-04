package tbclient.RecomVideo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14893common;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer load_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer new_net_type;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer page_thread_count;
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_NEW_NET_TYPE = 0;
    public static final Integer DEFAULT_LOAD_TYPE = 0;
    public static final Integer DEFAULT_PAGE_THREAD_COUNT = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f14893common = builder.f14894common;
            if (builder.scr_w == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = builder.scr_w;
            }
            if (builder.scr_h == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = builder.scr_h;
            }
            if (builder.scr_dip == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.new_net_type == null) {
                this.new_net_type = DEFAULT_NEW_NET_TYPE;
            } else {
                this.new_net_type = builder.new_net_type;
            }
            if (builder.load_type == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = builder.load_type;
            }
            if (builder.page_thread_count == null) {
                this.page_thread_count = DEFAULT_PAGE_THREAD_COUNT;
                return;
            } else {
                this.page_thread_count = builder.page_thread_count;
                return;
            }
        }
        this.f14893common = builder.f14894common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.new_net_type = builder.new_net_type;
        this.load_type = builder.load_type;
        this.page_thread_count = builder.page_thread_count;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14894common;
        public Integer load_type;
        public Integer new_net_type;
        public Integer page_thread_count;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f14894common = dataReq.f14893common;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.new_net_type = dataReq.new_net_type;
                this.load_type = dataReq.load_type;
                this.page_thread_count = dataReq.page_thread_count;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
