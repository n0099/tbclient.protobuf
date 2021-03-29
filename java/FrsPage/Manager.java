package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Manager extends Message {
    public static final Long DEFAULT_ID = 0L;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SHOW_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String show_name;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Manager> {
        public Long id;
        public String name;
        public String portrait;
        public String show_name;

        public Builder() {
        }

        public Builder(Manager manager) {
            super(manager);
            if (manager == null) {
                return;
            }
            this.id = manager.id;
            this.name = manager.name;
            this.show_name = manager.show_name;
            this.portrait = manager.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Manager build(boolean z) {
            return new Manager(this, z);
        }
    }

    public Manager(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.show_name;
            if (str2 == null) {
                this.show_name = "";
            } else {
                this.show_name = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str3;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.show_name = builder.show_name;
        this.portrait = builder.portrait;
    }
}
