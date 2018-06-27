package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
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

    private BottomMenu(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.submenu == null) {
                this.submenu = DEFAULT_SUBMENU;
                return;
            } else {
                this.submenu = immutableCopyOf(builder.submenu);
                return;
            }
        }
        this.name = builder.name;
        this.url = builder.url;
        this.submenu = immutableCopyOf(builder.submenu);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BottomMenu> {
        public String name;
        public List<SubBottomMenu> submenu;
        public String url;

        public Builder() {
        }

        public Builder(BottomMenu bottomMenu) {
            super(bottomMenu);
            if (bottomMenu != null) {
                this.name = bottomMenu.name;
                this.url = bottomMenu.url;
                this.submenu = BottomMenu.copyOf(bottomMenu.submenu);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BottomMenu build(boolean z) {
            return new BottomMenu(this, z);
        }
    }
}
