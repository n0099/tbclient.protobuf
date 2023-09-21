package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class TagsInfo extends Message {
    @ProtoField(tag = 1)
    public final ThemeColorInfo img_info;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TagsInfo> {
        public ThemeColorInfo img_info;

        public Builder() {
        }

        public Builder(TagsInfo tagsInfo) {
            super(tagsInfo);
            if (tagsInfo == null) {
                return;
            }
            this.img_info = tagsInfo.img_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TagsInfo build(boolean z) {
            return new TagsInfo(this, z);
        }
    }

    public TagsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.img_info = builder.img_info;
        } else {
            this.img_info = builder.img_info;
        }
    }
}
