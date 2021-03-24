package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<Custom> custom;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<IconInfo> icon_info;
    @ProtoField(tag = 3)
    public final Setting setting;
    @ProtoField(tag = 1)
    public final UserInfo user_info;
    public static final List<IconInfo> DEFAULT_ICON_INFO = Collections.emptyList();
    public static final List<Custom> DEFAULT_CUSTOM = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<Custom> custom;
        public List<IconInfo> icon_info;
        public Setting setting;
        public UserInfo user_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.user_info = dataRes.user_info;
            this.icon_info = Message.copyOf(dataRes.icon_info);
            this.setting = dataRes.setting;
            this.custom = Message.copyOf(dataRes.custom);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            List<IconInfo> list = builder.icon_info;
            if (list == null) {
                this.icon_info = DEFAULT_ICON_INFO;
            } else {
                this.icon_info = Message.immutableCopyOf(list);
            }
            this.setting = builder.setting;
            List<Custom> list2 = builder.custom;
            if (list2 == null) {
                this.custom = DEFAULT_CUSTOM;
                return;
            } else {
                this.custom = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.user_info = builder.user_info;
        this.icon_info = Message.immutableCopyOf(builder.icon_info);
        this.setting = builder.setting;
        this.custom = Message.immutableCopyOf(builder.custom);
    }
}
