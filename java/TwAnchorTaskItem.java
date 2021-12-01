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
/* loaded from: classes4.dex */
public final class TwAnchorTaskItem extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_COMPLETE;
    public static final String DEFAULT_ICON = "";
    public static final Integer DEFAULT_ID;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PROGRESS = "";
    public static final String DEFAULT_REMARK = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer complete;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String progress;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String remark;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<TwAnchorTaskItem> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer complete;
        public String icon;
        public Integer id;
        public String name;
        public String progress;
        public String remark;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(TwAnchorTaskItem twAnchorTaskItem) {
            super(twAnchorTaskItem);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {twAnchorTaskItem};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (twAnchorTaskItem == null) {
                return;
            }
            this.id = twAnchorTaskItem.id;
            this.name = twAnchorTaskItem.name;
            this.progress = twAnchorTaskItem.progress;
            this.complete = twAnchorTaskItem.complete;
            this.remark = twAnchorTaskItem.remark;
            this.icon = twAnchorTaskItem.icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorTaskItem build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TwAnchorTaskItem(this, z, null) : (TwAnchorTaskItem) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1852894943, "Ltbclient/TwAnchorTaskItem;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1852894943, "Ltbclient/TwAnchorTaskItem;");
                return;
            }
        }
        DEFAULT_ID = 0;
        DEFAULT_COMPLETE = 0;
    }

    public /* synthetic */ TwAnchorTaskItem(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwAnchorTaskItem(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.progress;
            if (str2 == null) {
                this.progress = "";
            } else {
                this.progress = str2;
            }
            Integer num2 = builder.complete;
            if (num2 == null) {
                this.complete = DEFAULT_COMPLETE;
            } else {
                this.complete = num2;
            }
            String str3 = builder.remark;
            if (str3 == null) {
                this.remark = "";
            } else {
                this.remark = str3;
            }
            String str4 = builder.icon;
            if (str4 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str4;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.progress = builder.progress;
        this.complete = builder.complete;
        this.remark = builder.remark;
        this.icon = builder.icon;
    }
}
