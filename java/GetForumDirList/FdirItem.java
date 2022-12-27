package tbclient.GetForumDirList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FdirItem extends Message {
    public static final String DEFAULT_LV1_NAME = "";
    public static final List<String> DEFAULT_LV2_NAME = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String lv1_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> lv2_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FdirItem> {
        public String lv1_name;
        public List<String> lv2_name;

        public Builder() {
        }

        public Builder(FdirItem fdirItem) {
            super(fdirItem);
            if (fdirItem == null) {
                return;
            }
            this.lv1_name = fdirItem.lv1_name;
            this.lv2_name = Message.copyOf(fdirItem.lv2_name);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FdirItem build(boolean z) {
            return new FdirItem(this, z);
        }
    }

    public FdirItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.lv1_name;
            if (str == null) {
                this.lv1_name = "";
            } else {
                this.lv1_name = str;
            }
            List<String> list = builder.lv2_name;
            if (list == null) {
                this.lv2_name = DEFAULT_LV2_NAME;
                return;
            } else {
                this.lv2_name = Message.immutableCopyOf(list);
                return;
            }
        }
        this.lv1_name = builder.lv1_name;
        this.lv2_name = Message.immutableCopyOf(builder.lv2_name);
    }
}
