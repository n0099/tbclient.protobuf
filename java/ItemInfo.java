package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ItemInfo extends Message {
    public static final String DEFAULT_BRIEF = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String brief;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> tags;
    public static final Integer DEFAULT_ID = 0;
    public static final List<String> DEFAULT_TAGS = Collections.emptyList();

    private ItemInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.icon_url == null) {
                this.icon_url = "";
            } else {
                this.icon_url = builder.icon_url;
            }
            if (builder.brief == null) {
                this.brief = "";
            } else {
                this.brief = builder.brief;
            }
            if (builder.tags == null) {
                this.tags = DEFAULT_TAGS;
                return;
            } else {
                this.tags = immutableCopyOf(builder.tags);
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.icon_url = builder.icon_url;
        this.brief = builder.brief;
        this.tags = immutableCopyOf(builder.tags);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ItemInfo> {
        public String brief;
        public String icon_url;
        public Integer id;
        public String name;
        public List<String> tags;

        public Builder() {
        }

        public Builder(ItemInfo itemInfo) {
            super(itemInfo);
            if (itemInfo != null) {
                this.id = itemInfo.id;
                this.name = itemInfo.name;
                this.icon_url = itemInfo.icon_url;
                this.brief = itemInfo.brief;
                this.tags = ItemInfo.copyOf(itemInfo.tags);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemInfo build(boolean z) {
            return new ItemInfo(this, z);
        }
    }
}
