package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<IconInfo> DEFAULT_ICON_INFO = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<IconInfo> icon_info;
    @ProtoField(tag = 1)
    public final UserInfo user_info;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            if (builder.icon_info == null) {
                this.icon_info = DEFAULT_ICON_INFO;
                return;
            } else {
                this.icon_info = immutableCopyOf(builder.icon_info);
                return;
            }
        }
        this.user_info = builder.user_info;
        this.icon_info = immutableCopyOf(builder.icon_info);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<IconInfo> icon_info;
        public UserInfo user_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user_info = dataRes.user_info;
                this.icon_info = DataRes.copyOf(dataRes.icon_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
