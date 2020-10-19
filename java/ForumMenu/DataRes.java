package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes26.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_menu;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Menu> parent_menu;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer update_time;
    public static final List<Menu> DEFAULT_PARENT_MENU = Collections.emptyList();
    public static final Integer DEFAULT_UPDATE_TIME = 0;
    public static final Integer DEFAULT_HAS_MENU = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.parent_menu == null) {
                this.parent_menu = DEFAULT_PARENT_MENU;
            } else {
                this.parent_menu = immutableCopyOf(builder.parent_menu);
            }
            if (builder.update_time == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.has_menu == null) {
                this.has_menu = DEFAULT_HAS_MENU;
                return;
            } else {
                this.has_menu = builder.has_menu;
                return;
            }
        }
        this.parent_menu = immutableCopyOf(builder.parent_menu);
        this.update_time = builder.update_time;
        this.has_menu = builder.has_menu;
    }

    /* loaded from: classes26.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_menu;
        public List<Menu> parent_menu;
        public Integer update_time;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.parent_menu = DataRes.copyOf(dataRes.parent_menu);
                this.update_time = dataRes.update_time;
                this.has_menu = dataRes.has_menu;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
