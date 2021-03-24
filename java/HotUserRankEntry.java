package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class HotUserRankEntry extends Message {
    public static final String DEFAULT_MODULE_ICON = "";
    public static final String DEFAULT_MODULE_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ShortUserInfo> hot_user;
    @ProtoField(tag = 6, type = Message.Datatype.BOOL)
    public final Boolean is_in_rank;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String module_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer today_rank;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer yesterday_rank;
    public static final List<ShortUserInfo> DEFAULT_HOT_USER = Collections.emptyList();
    public static final Integer DEFAULT_TODAY_RANK = 0;
    public static final Integer DEFAULT_YESTERDAY_RANK = 0;
    public static final Boolean DEFAULT_IS_IN_RANK = Boolean.FALSE;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<HotUserRankEntry> {
        public List<ShortUserInfo> hot_user;
        public Boolean is_in_rank;
        public String module_icon;
        public String module_name;
        public Integer today_rank;
        public Integer yesterday_rank;

        public Builder() {
        }

        public Builder(HotUserRankEntry hotUserRankEntry) {
            super(hotUserRankEntry);
            if (hotUserRankEntry == null) {
                return;
            }
            this.hot_user = Message.copyOf(hotUserRankEntry.hot_user);
            this.module_name = hotUserRankEntry.module_name;
            this.module_icon = hotUserRankEntry.module_icon;
            this.today_rank = hotUserRankEntry.today_rank;
            this.yesterday_rank = hotUserRankEntry.yesterday_rank;
            this.is_in_rank = hotUserRankEntry.is_in_rank;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotUserRankEntry build(boolean z) {
            return new HotUserRankEntry(this, z);
        }
    }

    public HotUserRankEntry(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ShortUserInfo> list = builder.hot_user;
            if (list == null) {
                this.hot_user = DEFAULT_HOT_USER;
            } else {
                this.hot_user = Message.immutableCopyOf(list);
            }
            String str = builder.module_name;
            if (str == null) {
                this.module_name = "";
            } else {
                this.module_name = str;
            }
            String str2 = builder.module_icon;
            if (str2 == null) {
                this.module_icon = "";
            } else {
                this.module_icon = str2;
            }
            Integer num = builder.today_rank;
            if (num == null) {
                this.today_rank = DEFAULT_TODAY_RANK;
            } else {
                this.today_rank = num;
            }
            Integer num2 = builder.yesterday_rank;
            if (num2 == null) {
                this.yesterday_rank = DEFAULT_YESTERDAY_RANK;
            } else {
                this.yesterday_rank = num2;
            }
            Boolean bool = builder.is_in_rank;
            if (bool == null) {
                this.is_in_rank = DEFAULT_IS_IN_RANK;
                return;
            } else {
                this.is_in_rank = bool;
                return;
            }
        }
        this.hot_user = Message.immutableCopyOf(builder.hot_user);
        this.module_name = builder.module_name;
        this.module_icon = builder.module_icon;
        this.today_rank = builder.today_rank;
        this.yesterday_rank = builder.yesterday_rank;
        this.is_in_rank = builder.is_in_rank;
    }
}
