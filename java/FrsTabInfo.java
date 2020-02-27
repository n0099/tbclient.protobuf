package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FrsTabInfo extends Message {
    public static final String DEFAULT_TAB_GID = "";
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_TAB_TITLE = "";
    public static final String DEFAULT_TAB_URL = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tab_gid;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer tab_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tab_title;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tab_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tab_url;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final Integer DEFAULT_TAB_TYPE = 0;

    private FrsTabInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tab_id == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = builder.tab_id;
            }
            if (builder.tab_type == null) {
                this.tab_type = DEFAULT_TAB_TYPE;
            } else {
                this.tab_type = builder.tab_type;
            }
            if (builder.tab_name == null) {
                this.tab_name = "";
            } else {
                this.tab_name = builder.tab_name;
            }
            if (builder.tab_url == null) {
                this.tab_url = "";
            } else {
                this.tab_url = builder.tab_url;
            }
            if (builder.tab_gid == null) {
                this.tab_gid = "";
            } else {
                this.tab_gid = builder.tab_gid;
            }
            if (builder.tab_title == null) {
                this.tab_title = "";
                return;
            } else {
                this.tab_title = builder.tab_title;
                return;
            }
        }
        this.tab_id = builder.tab_id;
        this.tab_type = builder.tab_type;
        this.tab_name = builder.tab_name;
        this.tab_url = builder.tab_url;
        this.tab_gid = builder.tab_gid;
        this.tab_title = builder.tab_title;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FrsTabInfo> {
        public String tab_gid;
        public Integer tab_id;
        public String tab_name;
        public String tab_title;
        public Integer tab_type;
        public String tab_url;

        public Builder() {
        }

        public Builder(FrsTabInfo frsTabInfo) {
            super(frsTabInfo);
            if (frsTabInfo != null) {
                this.tab_id = frsTabInfo.tab_id;
                this.tab_type = frsTabInfo.tab_type;
                this.tab_name = frsTabInfo.tab_name;
                this.tab_url = frsTabInfo.tab_url;
                this.tab_gid = frsTabInfo.tab_gid;
                this.tab_title = frsTabInfo.tab_title;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsTabInfo build(boolean z) {
            return new FrsTabInfo(this, z);
        }
    }
}
