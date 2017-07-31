package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;
/* loaded from: classes.dex */
public final class NavTabInfo extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FrsTabInfo> menu;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FrsTabInfo> tab;
    public static final List<FrsTabInfo> DEFAULT_TAB = Collections.emptyList();
    public static final List<FrsTabInfo> DEFAULT_MENU = Collections.emptyList();

    private NavTabInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tab == null) {
                this.tab = DEFAULT_TAB;
            } else {
                this.tab = immutableCopyOf(builder.tab);
            }
            if (builder.menu == null) {
                this.menu = DEFAULT_MENU;
                return;
            } else {
                this.menu = immutableCopyOf(builder.menu);
                return;
            }
        }
        this.tab = immutableCopyOf(builder.tab);
        this.menu = immutableCopyOf(builder.menu);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<NavTabInfo> {
        public List<FrsTabInfo> menu;
        public List<FrsTabInfo> tab;

        public Builder() {
        }

        public Builder(NavTabInfo navTabInfo) {
            super(navTabInfo);
            if (navTabInfo != null) {
                this.tab = NavTabInfo.copyOf(navTabInfo.tab);
                this.menu = NavTabInfo.copyOf(navTabInfo.menu);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NavTabInfo build(boolean z) {
            return new NavTabInfo(this, z);
        }
    }
}
