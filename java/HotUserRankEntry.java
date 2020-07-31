package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class HotUserRankEntry extends Message {
    public static final List<ShortUserInfo> DEFAULT_HOT_USER = Collections.emptyList();
    public static final String DEFAULT_MODULE_ICON = "";
    public static final String DEFAULT_MODULE_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ShortUserInfo> hot_user;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String module_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String module_name;

    private HotUserRankEntry(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.hot_user == null) {
                this.hot_user = DEFAULT_HOT_USER;
            } else {
                this.hot_user = immutableCopyOf(builder.hot_user);
            }
            if (builder.module_name == null) {
                this.module_name = "";
            } else {
                this.module_name = builder.module_name;
            }
            if (builder.module_icon == null) {
                this.module_icon = "";
                return;
            } else {
                this.module_icon = builder.module_icon;
                return;
            }
        }
        this.hot_user = immutableCopyOf(builder.hot_user);
        this.module_name = builder.module_name;
        this.module_icon = builder.module_icon;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<HotUserRankEntry> {
        public List<ShortUserInfo> hot_user;
        public String module_icon;
        public String module_name;

        public Builder() {
        }

        public Builder(HotUserRankEntry hotUserRankEntry) {
            super(hotUserRankEntry);
            if (hotUserRankEntry != null) {
                this.hot_user = HotUserRankEntry.copyOf(hotUserRankEntry.hot_user);
                this.module_name = hotUserRankEntry.module_name;
                this.module_icon = hotUserRankEntry.module_icon;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotUserRankEntry build(boolean z) {
            return new HotUserRankEntry(this, z);
        }
    }
}
