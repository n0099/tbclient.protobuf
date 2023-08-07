package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CLASS_ID = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1470common;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer load_type;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer new_net_type;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer page_thread_count;
    @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer sub_class_id;
    public static final Integer DEFAULT_SUB_CLASS_ID = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_NEW_NET_TYPE = 0;
    public static final Integer DEFAULT_LOAD_TYPE = 0;
    public static final Integer DEFAULT_PAGE_THREAD_COUNT = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String class_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1471common;
        public Integer load_type;
        public Integer new_net_type;
        public Integer page_thread_count;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer sub_class_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1471common = dataReq.f1470common;
            this.class_id = dataReq.class_id;
            this.sub_class_id = dataReq.sub_class_id;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.new_net_type = dataReq.new_net_type;
            this.load_type = dataReq.load_type;
            this.page_thread_count = dataReq.page_thread_count;
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
            this.f1470common = builder.f1471common;
            String str = builder.class_id;
            if (str == null) {
                this.class_id = "";
            } else {
                this.class_id = str;
            }
            Integer num = builder.sub_class_id;
            if (num == null) {
                this.sub_class_id = DEFAULT_SUB_CLASS_ID;
            } else {
                this.sub_class_id = num;
            }
            Integer num2 = builder.scr_w;
            if (num2 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num2;
            }
            Integer num3 = builder.scr_h;
            if (num3 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num3;
            }
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d;
            }
            Integer num4 = builder.new_net_type;
            if (num4 == null) {
                this.new_net_type = DEFAULT_NEW_NET_TYPE;
            } else {
                this.new_net_type = num4;
            }
            Integer num5 = builder.load_type;
            if (num5 == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = num5;
            }
            Integer num6 = builder.page_thread_count;
            if (num6 == null) {
                this.page_thread_count = DEFAULT_PAGE_THREAD_COUNT;
                return;
            } else {
                this.page_thread_count = num6;
                return;
            }
        }
        this.f1470common = builder.f1471common;
        this.class_id = builder.class_id;
        this.sub_class_id = builder.sub_class_id;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.new_net_type = builder.new_net_type;
        this.load_type = builder.load_type;
        this.page_thread_count = builder.page_thread_count;
    }
}
