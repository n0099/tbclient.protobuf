package tbclient.GameForumGuideTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69386common;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer need_tab_stuct;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer ps;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer sub_label_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer sub_tab_id;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_PS = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_SUB_TAB_ID = 0;
    public static final Integer DEFAULT_SUB_LABEL_ID = 0;
    public static final Integer DEFAULT_NEED_TAB_STUCT = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69387common;
        public Long forum_id;
        public Integer need_tab_stuct;
        public Integer pn;
        public Integer ps;
        public Integer sub_label_id;
        public Integer sub_tab_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69387common = dataReq.f69386common;
            this.pn = dataReq.pn;
            this.ps = dataReq.ps;
            this.forum_id = dataReq.forum_id;
            this.sub_tab_id = dataReq.sub_tab_id;
            this.sub_label_id = dataReq.sub_label_id;
            this.need_tab_stuct = dataReq.need_tab_stuct;
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
            this.f69386common = builder.f69387common;
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.ps;
            if (num2 == null) {
                this.ps = DEFAULT_PS;
            } else {
                this.ps = num2;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Integer num3 = builder.sub_tab_id;
            if (num3 == null) {
                this.sub_tab_id = DEFAULT_SUB_TAB_ID;
            } else {
                this.sub_tab_id = num3;
            }
            Integer num4 = builder.sub_label_id;
            if (num4 == null) {
                this.sub_label_id = DEFAULT_SUB_LABEL_ID;
            } else {
                this.sub_label_id = num4;
            }
            Integer num5 = builder.need_tab_stuct;
            if (num5 == null) {
                this.need_tab_stuct = DEFAULT_NEED_TAB_STUCT;
                return;
            } else {
                this.need_tab_stuct = num5;
                return;
            }
        }
        this.f69386common = builder.f69387common;
        this.pn = builder.pn;
        this.ps = builder.ps;
        this.forum_id = builder.forum_id;
        this.sub_tab_id = builder.sub_tab_id;
        this.sub_label_id = builder.sub_label_id;
        this.need_tab_stuct = builder.need_tab_stuct;
    }
}
