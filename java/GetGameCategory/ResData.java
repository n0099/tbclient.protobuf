package tbclient.GetGameCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameCategory;
/* loaded from: classes.dex */
public final class ResData extends Message {
    public static final List<GameCategory> DEFAULT_CATEGORY_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GameCategory> category_list;

    /* synthetic */ ResData(Builder builder, boolean z, ResData resData) {
        this(builder, z);
    }

    private ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.category_list == null) {
                this.category_list = DEFAULT_CATEGORY_LIST;
                return;
            } else {
                this.category_list = immutableCopyOf(builder.category_list);
                return;
            }
        }
        this.category_list = immutableCopyOf(builder.category_list);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ResData> {
        public List<GameCategory> category_list;

        public Builder(ResData resData) {
            super(resData);
            if (resData != null) {
                this.category_list = ResData.copyOf(resData.category_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z, null);
        }
    }
}
