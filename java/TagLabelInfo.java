package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class TagLabelInfo extends Message {
    public static final List<ThemeColorInfo> DEFAULT_LABELS = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThemeColorInfo> labels;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TagLabelInfo> {
        public List<ThemeColorInfo> labels;

        public Builder() {
        }

        public Builder(TagLabelInfo tagLabelInfo) {
            super(tagLabelInfo);
            if (tagLabelInfo == null) {
                return;
            }
            this.labels = Message.copyOf(tagLabelInfo.labels);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TagLabelInfo build(boolean z) {
            return new TagLabelInfo(this, z);
        }
    }

    public TagLabelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThemeColorInfo> list = builder.labels;
            if (list == null) {
                this.labels = DEFAULT_LABELS;
                return;
            } else {
                this.labels = Message.immutableCopyOf(list);
                return;
            }
        }
        this.labels = Message.immutableCopyOf(builder.labels);
    }
}
