package tbclient.LiveBarSpecial;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class TabInfo extends Message {
    public static final String DEFAULT_LIVE_TAB_TYPE = "";
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final String DEFAULT_TAB_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String live_tab_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer tab_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tab_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TabInfo> {
        public String live_tab_type;
        public Integer tab_id;
        public String tab_name;

        public Builder() {
        }

        public Builder(TabInfo tabInfo) {
            super(tabInfo);
            if (tabInfo == null) {
                return;
            }
            this.tab_name = tabInfo.tab_name;
            this.tab_id = tabInfo.tab_id;
            this.live_tab_type = tabInfo.live_tab_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabInfo build(boolean z) {
            return new TabInfo(this, z);
        }
    }

    public TabInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            Integer num = builder.tab_id;
            if (num == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num;
            }
            String str2 = builder.live_tab_type;
            if (str2 == null) {
                this.live_tab_type = "";
                return;
            } else {
                this.live_tab_type = str2;
                return;
            }
        }
        this.tab_name = builder.tab_name;
        this.tab_id = builder.tab_id;
        this.live_tab_type = builder.live_tab_type;
    }
}
