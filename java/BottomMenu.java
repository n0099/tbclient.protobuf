package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class BottomMenu extends Message {
    public static final String DEFAULT_NAME = "";
    public static final List<SubBottomMenu> DEFAULT_SUBMENU = Collections.emptyList();
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<SubBottomMenu> submenu;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<BottomMenu> {
        public String name;
        public List<SubBottomMenu> submenu;
        public String url;

        public Builder() {
        }

        public Builder(BottomMenu bottomMenu) {
            super(bottomMenu);
            if (bottomMenu == null) {
                return;
            }
            this.name = bottomMenu.name;
            this.url = bottomMenu.url;
            this.submenu = Message.copyOf(bottomMenu.submenu);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BottomMenu build(boolean z) {
            return new BottomMenu(this, z);
        }
    }

    public BottomMenu(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
            } else {
                this.url = str2;
            }
            List<SubBottomMenu> list = builder.submenu;
            if (list == null) {
                this.submenu = DEFAULT_SUBMENU;
                return;
            } else {
                this.submenu = Message.immutableCopyOf(list);
                return;
            }
        }
        this.name = builder.name;
        this.url = builder.url;
        this.submenu = Message.immutableCopyOf(builder.submenu);
    }
}
