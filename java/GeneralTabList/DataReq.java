package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes4.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_default_navtab;
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
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tab_id;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_SCR_DIP = 0;
    public static final Long DEFAULT_LAST_THREAD_ID = 0L;
    public static final Integer DEFAULT_IS_DEFAULT_NAVTAB = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
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
                return;
            } else {
                this.is_default_navtab = builder.is_default_navtab;
                return;
            }
        }
        this.common = builder.common;
        this.tab_id = builder.tab_id;
        this.forum_id = builder.forum_id;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.last_thread_id = builder.last_thread_id;
        this.is_default_navtab = builder.is_default_navtab;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Long forum_id;
        public Integer is_default_navtab;
        public Long last_thread_id;
        public Integer pn;
        public Integer rn;
        public Integer scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer tab_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.tab_id = dataReq.tab_id;
                this.forum_id = dataReq.forum_id;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.last_thread_id = dataReq.last_thread_id;
                this.is_default_navtab = dataReq.is_default_navtab;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
