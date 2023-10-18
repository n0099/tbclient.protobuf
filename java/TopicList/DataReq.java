package tbclient.TopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";
    public static final Long DEFAULT_FID = 0L;
    public static final String DEFAULT_LIST_TYPE = "";
    public static final String DEFAULT_NEED_TAB_LIST = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1500common;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String list_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String need_tab_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1501common;
        public Long fid;
        public String list_type;
        public String need_tab_list;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1501common = dataReq.f1500common;
            this.call_from = dataReq.call_from;
            this.list_type = dataReq.list_type;
            this.need_tab_list = dataReq.need_tab_list;
            this.fid = dataReq.fid;
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
            this.f1500common = builder.f1501common;
            String str = builder.call_from;
            if (str == null) {
                this.call_from = "";
            } else {
                this.call_from = str;
            }
            String str2 = builder.list_type;
            if (str2 == null) {
                this.list_type = "";
            } else {
                this.list_type = str2;
            }
            String str3 = builder.need_tab_list;
            if (str3 == null) {
                this.need_tab_list = "";
            } else {
                this.need_tab_list = str3;
            }
            Long l = builder.fid;
            if (l == null) {
                this.fid = DEFAULT_FID;
                return;
            } else {
                this.fid = l;
                return;
            }
        }
        this.f1500common = builder.f1501common;
        this.call_from = builder.call_from;
        this.list_type = builder.list_type;
        this.need_tab_list = builder.need_tab_list;
        this.fid = builder.fid;
    }
}
