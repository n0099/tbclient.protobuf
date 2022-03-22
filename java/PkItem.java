package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class PkItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_HAS_CLICKED;
    public static final String DEFAULT_LAST_USERNAME = "";
    public static final String DEFAULT_PK_DESC = "";
    public static final String DEFAULT_PK_ICON = "";
    public static final String DEFAULT_PK_ICON_AFTER = "";
    public static final Long DEFAULT_PK_INDEX;
    public static final Long DEFAULT_PK_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long has_clicked;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String last_username;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pk_desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pk_icon;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String pk_icon_after;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long pk_index;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long pk_num;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<PkItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long has_clicked;
        public String last_username;
        public String pk_desc;
        public String pk_icon;
        public String pk_icon_after;
        public Long pk_index;
        public Long pk_num;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(PkItem pkItem) {
            super(pkItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pkItem};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (pkItem == null) {
                return;
            }
            this.pk_num = pkItem.pk_num;
            this.pk_desc = pkItem.pk_desc;
            this.last_username = pkItem.last_username;
            this.pk_icon = pkItem.pk_icon;
            this.has_clicked = pkItem.has_clicked;
            this.pk_index = pkItem.pk_index;
            this.pk_icon_after = pkItem.pk_icon_after;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PkItem(this, z, null) : (PkItem) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-397125085, "Ltbclient/PkItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-397125085, "Ltbclient/PkItem;");
                return;
            }
        }
        DEFAULT_PK_NUM = 0L;
        DEFAULT_HAS_CLICKED = 0L;
        DEFAULT_PK_INDEX = 0L;
    }

    public /* synthetic */ PkItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkItem(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.pk_num;
            if (l == null) {
                this.pk_num = DEFAULT_PK_NUM;
            } else {
                this.pk_num = l;
            }
            String str = builder.pk_desc;
            if (str == null) {
                this.pk_desc = "";
            } else {
                this.pk_desc = str;
            }
            String str2 = builder.last_username;
            if (str2 == null) {
                this.last_username = "";
            } else {
                this.last_username = str2;
            }
            String str3 = builder.pk_icon;
            if (str3 == null) {
                this.pk_icon = "";
            } else {
                this.pk_icon = str3;
            }
            Long l2 = builder.has_clicked;
            if (l2 == null) {
                this.has_clicked = DEFAULT_HAS_CLICKED;
            } else {
                this.has_clicked = l2;
            }
            Long l3 = builder.pk_index;
            if (l3 == null) {
                this.pk_index = DEFAULT_PK_INDEX;
            } else {
                this.pk_index = l3;
            }
            String str4 = builder.pk_icon_after;
            if (str4 == null) {
                this.pk_icon_after = "";
                return;
            } else {
                this.pk_icon_after = str4;
                return;
            }
        }
        this.pk_num = builder.pk_num;
        this.pk_desc = builder.pk_desc;
        this.last_username = builder.last_username;
        this.pk_icon = builder.pk_icon;
        this.has_clicked = builder.has_clicked;
        this.pk_index = builder.pk_index;
        this.pk_icon_after = builder.pk_icon_after;
    }
}
