package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class TabSkin extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_ICON_NIGHT = "";
    public static final Integer DEFAULT_TAB_ID = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_night;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer tab_id;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<TabSkin> {
        public String icon;
        public String icon_night;
        public Integer tab_id;

        public Builder() {
        }

        public Builder(TabSkin tabSkin) {
            super(tabSkin);
            if (tabSkin == null) {
                return;
            }
            this.tab_id = tabSkin.tab_id;
            this.icon = tabSkin.icon;
            this.icon_night = tabSkin.icon_night;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabSkin build(boolean z) {
            return new TabSkin(this, z);
        }
    }

    public TabSkin(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.tab_id;
            if (num == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num;
            }
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.icon_night;
            if (str2 == null) {
                this.icon_night = "";
                return;
            } else {
                this.icon_night = str2;
                return;
            }
        }
        this.tab_id = builder.tab_id;
        this.icon = builder.icon;
        this.icon_night = builder.icon_night;
    }
}
