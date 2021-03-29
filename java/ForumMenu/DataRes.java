package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_menu;
        public List<Menu> parent_menu;
        public Integer update_time;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.parent_menu = Message.copyOf(dataRes.parent_menu);
            this.update_time = dataRes.update_time;
            this.has_menu = dataRes.has_menu;
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
            List<Menu> list = builder.parent_menu;
            if (list == null) {
                this.parent_menu = DEFAULT_PARENT_MENU;
            } else {
                this.parent_menu = Message.immutableCopyOf(list);
            }
            Integer num = builder.update_time;
            if (num == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num;
            }
            Integer num2 = builder.has_menu;
            if (num2 == null) {
                this.has_menu = DEFAULT_HAS_MENU;
                return;
            } else {
                this.has_menu = num2;
                return;
            }
        }
        this.parent_menu = Message.immutableCopyOf(builder.parent_menu);
        this.update_time = builder.update_time;
        this.has_menu = builder.has_menu;
    }
}
