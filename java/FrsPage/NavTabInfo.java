package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;
/* loaded from: classes21.dex */
public final class NavTabInfo extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FrsTabInfo> head;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FrsTabInfo> menu;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FrsTabInfo> tab;
    public static final List<FrsTabInfo> DEFAULT_TAB = Collections.emptyList();
    public static final List<FrsTabInfo> DEFAULT_MENU = Collections.emptyList();
    public static final List<FrsTabInfo> DEFAULT_HEAD = Collections.emptyList();

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
            } else {
                this.menu = immutableCopyOf(builder.menu);
            }
            if (builder.head == null) {
                this.head = DEFAULT_HEAD;
                return;
            } else {
                this.head = immutableCopyOf(builder.head);
                return;
            }
        }
        this.tab = immutableCopyOf(builder.tab);
        this.menu = immutableCopyOf(builder.menu);
        this.head = immutableCopyOf(builder.head);
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<NavTabInfo> {
        public List<FrsTabInfo> head;
        public List<FrsTabInfo> menu;
        public List<FrsTabInfo> tab;

        public Builder() {
        }

        public Builder(NavTabInfo navTabInfo) {
            super(navTabInfo);
            if (navTabInfo != null) {
                this.tab = NavTabInfo.copyOf(navTabInfo.tab);
                this.menu = NavTabInfo.copyOf(navTabInfo.menu);
                this.head = NavTabInfo.copyOf(navTabInfo.head);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NavTabInfo build(boolean z) {
            return new NavTabInfo(this, z);
        }
    }
}
