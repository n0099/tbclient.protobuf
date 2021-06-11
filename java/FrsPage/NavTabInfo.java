package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;
/* loaded from: classes8.dex */
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

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<NavTabInfo> {
        public List<FrsTabInfo> head;
        public List<FrsTabInfo> menu;
        public List<FrsTabInfo> tab;

        public Builder() {
        }

        public Builder(NavTabInfo navTabInfo) {
            super(navTabInfo);
            if (navTabInfo == null) {
                return;
            }
            this.tab = Message.copyOf(navTabInfo.tab);
            this.menu = Message.copyOf(navTabInfo.menu);
            this.head = Message.copyOf(navTabInfo.head);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NavTabInfo build(boolean z) {
            return new NavTabInfo(this, z);
        }
    }

    public NavTabInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FrsTabInfo> list = builder.tab;
            if (list == null) {
                this.tab = DEFAULT_TAB;
            } else {
                this.tab = Message.immutableCopyOf(list);
            }
            List<FrsTabInfo> list2 = builder.menu;
            if (list2 == null) {
                this.menu = DEFAULT_MENU;
            } else {
                this.menu = Message.immutableCopyOf(list2);
            }
            List<FrsTabInfo> list3 = builder.head;
            if (list3 == null) {
                this.head = DEFAULT_HEAD;
                return;
            } else {
                this.head = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.tab = Message.immutableCopyOf(builder.tab);
        this.menu = Message.immutableCopyOf(builder.menu);
        this.head = Message.immutableCopyOf(builder.head);
    }
}
