package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
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

    private TabSkin(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tab_id == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = builder.tab_id;
            }
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.icon_night == null) {
                this.icon_night = "";
                return;
            } else {
                this.icon_night = builder.icon_night;
                return;
            }
        }
        this.tab_id = builder.tab_id;
        this.icon = builder.icon;
        this.icon_night = builder.icon_night;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<TabSkin> {
        public String icon;
        public String icon_night;
        public Integer tab_id;

        public Builder() {
        }

        public Builder(TabSkin tabSkin) {
            super(tabSkin);
            if (tabSkin != null) {
                this.tab_id = tabSkin.tab_id;
                this.icon = tabSkin.icon;
                this.icon_night = tabSkin.icon_night;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabSkin build(boolean z) {
            return new TabSkin(this, z);
        }
    }
}
