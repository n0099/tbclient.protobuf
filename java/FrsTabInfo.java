package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class FrsTabInfo extends Message {
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_TAB_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer tab_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tab_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tab_url;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final Integer DEFAULT_TAB_TYPE = 0;

    /* synthetic */ FrsTabInfo(Builder builder, boolean z, FrsTabInfo frsTabInfo) {
        this(builder, z);
    }

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
                return;
            } else {
                this.tab_url = builder.tab_url;
                return;
            }
        }
        this.tab_id = builder.tab_id;
        this.tab_type = builder.tab_type;
        this.tab_name = builder.tab_name;
        this.tab_url = builder.tab_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<FrsTabInfo> {
        public Integer tab_id;
        public String tab_name;
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsTabInfo build(boolean z) {
            return new FrsTabInfo(this, z, null);
        }
    }
}
