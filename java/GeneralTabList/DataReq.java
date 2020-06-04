package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TAB_NAME = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1097common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_default_navtab;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_general_tab;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long last_thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_dip;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tab_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer tab_type;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_SCR_DIP = 0;
    public static final Long DEFAULT_LAST_THREAD_ID = 0L;
    public static final Integer DEFAULT_IS_DEFAULT_NAVTAB = 0;
    public static final Integer DEFAULT_IS_GENERAL_TAB = 0;
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final Integer DEFAULT_TAB_TYPE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1097common = builder.f1098common;
            if (builder.tab_id == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = builder.tab_id;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
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
            if (builder.last_thread_id == null) {
                this.last_thread_id = DEFAULT_LAST_THREAD_ID;
            } else {
                this.last_thread_id = builder.last_thread_id;
            }
            if (builder.is_default_navtab == null) {
                this.is_default_navtab = DEFAULT_IS_DEFAULT_NAVTAB;
            } else {
                this.is_default_navtab = builder.is_default_navtab;
            }
            if (builder.tab_name == null) {
                this.tab_name = "";
            } else {
                this.tab_name = builder.tab_name;
            }
            if (builder.is_general_tab == null) {
                this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
            } else {
                this.is_general_tab = builder.is_general_tab;
            }
            if (builder.sort_type == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = builder.sort_type;
            }
            if (builder.tab_type == null) {
                this.tab_type = DEFAULT_TAB_TYPE;
                return;
            } else {
                this.tab_type = builder.tab_type;
                return;
            }
        }
        this.f1097common = builder.f1098common;
        this.tab_id = builder.tab_id;
        this.forum_id = builder.forum_id;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.last_thread_id = builder.last_thread_id;
        this.is_default_navtab = builder.is_default_navtab;
        this.tab_name = builder.tab_name;
        this.is_general_tab = builder.is_general_tab;
        this.sort_type = builder.sort_type;
        this.tab_type = builder.tab_type;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1098common;
        public Long forum_id;
        public Integer is_default_navtab;
        public Integer is_general_tab;
        public Long last_thread_id;
        public Integer pn;
        public Integer rn;
        public Integer scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer sort_type;
        public Integer tab_id;
        public String tab_name;
        public Integer tab_type;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1098common = dataReq.f1097common;
                this.tab_id = dataReq.tab_id;
                this.forum_id = dataReq.forum_id;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.last_thread_id = dataReq.last_thread_id;
                this.is_default_navtab = dataReq.is_default_navtab;
                this.tab_name = dataReq.tab_name;
                this.is_general_tab = dataReq.is_general_tab;
                this.sort_type = dataReq.sort_type;
                this.tab_type = dataReq.tab_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
